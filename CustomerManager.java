import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CustomerManager extends JFrame {
    private JTextField idField, nameField, emailField, phoneField;
    private JTextArea outputArea;
    private JButton addButton, searchButton, updateButton, viewAllButton;

    public CustomerManager() {
        setTitle("Customer Manager");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Customer Info"));

        idField = new JTextField();
        nameField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();

        inputPanel.add(new JLabel("Customer ID (for search/update):"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(emailField);
        inputPanel.add(new JLabel("Phone:"));
        inputPanel.add(phoneField);

        addButton = new JButton("Add");
        searchButton = new JButton("Search");
        updateButton = new JButton("Update");
        viewAllButton = new JButton("View All");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(viewAllButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        addButton.addActionListener(e -> insertCustomer());
        searchButton.addActionListener(e -> searchCustomer());
        updateButton.addActionListener(e -> updateCustomer());
        viewAllButton.addActionListener(e -> viewAllCustomers());
    }

    private void insertCustomer() {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO Customers (customer_id, customer_name, email, phone) VALUES (seq_customer.NEXTVAL, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nameField.getText());
            ps.setString(2, emailField.getText());
            ps.setString(3, phoneField.getText());
            ps.executeUpdate();
            outputArea.setText("✅ Customer added successfully.");
        } catch (SQLException ex) {
            outputArea.setText("❌ Error: " + ex.getMessage());
        }
    }

    private void searchCustomer() {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM Customers WHERE customer_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idField.getText()));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nameField.setText(rs.getString("customer_name"));
                emailField.setText(rs.getString("email"));
                phoneField.setText(rs.getString("phone"));
                outputArea.setText("🔎 Customer found and loaded.");
            } else {
                outputArea.setText("❌ Customer not found.");
            }
        } catch (SQLException ex) {
            outputArea.setText("❌ Error: " + ex.getMessage());
        }
    }

    private void updateCustomer() {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE Customers SET customer_name=?, email=?, phone=? WHERE customer_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nameField.getText());
            ps.setString(2, emailField.getText());
            ps.setString(3, phoneField.getText());
            ps.setInt(4, Integer.parseInt(idField.getText()));
            int updated = ps.executeUpdate();
            if (updated > 0) {
                outputArea.setText("✅ Customer updated successfully.");
            } else {
                outputArea.setText("❌ Customer not found.");
            }
        } catch (SQLException ex) {
            outputArea.setText("❌ Error: " + ex.getMessage());
        }
    }

    private void viewAllCustomers() {
        outputArea.setText("");
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM Customers";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                outputArea.append(
                    rs.getInt("customer_id") + " - " +
                    rs.getString("customer_name") + " - " +
                    rs.getString("email") + " - " +
                    rs.getString("phone") + "\n"
                );
            }
        } catch (SQLException ex) {
            outputArea.setText("❌ Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomerManager().setVisible(true));
    }
}