/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import clases.Contact;
import clases.Person;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonCRUDApp {

    private List<Person> personList;
    private DefaultListModel<String> listModel;
    private JList<String> personListView;
    private JTextField idField, nameField, genderField, birthdayField;
    private JButton addButton, updateButton, deleteButton;

    public PersonCRUDApp() {
        personList = new ArrayList<>();
        listModel = new DefaultListModel<>();

        // Create the main frame
        JFrame frame = new JFrame("Person CRUD Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField(10);
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField(10);
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Gender:"));
        genderField = new JTextField(10);
        inputPanel.add(genderField);
        inputPanel.add(new JLabel("Birthday:"));
        birthdayField = new JTextField(10);
        inputPanel.add(birthdayField);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        // Create a list view for persons
        personListView = new JList<>(listModel);

        // Add components to the frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(personListView), BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Register event listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createPerson();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePerson();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletePerson();
            }
        });

        // Display the frame
        frame.pack();
        frame.setVisible(true);
    }

    // Create a new person
    private void createPerson() {
        String id = idField.getText();
        String name = nameField.getText();
        char gender = genderField.getText().charAt(0);
        Date birthday = new Date(); // You need to parse the date input
        Contact contact = new Contact(); // Create a Contact object

        Person person = new Person(gender, birthday, id, name, contact);
        personList.add(person);
        listModel.addElement(person.toString());

        // Clear the input fields
        idField.setText("");
        nameField.setText("");
        genderField.setText("");
        birthdayField.setText("");
    }

    // Update an existing person
    private void updatePerson() {
        int selectedIndex = personListView.getSelectedIndex();
        if (selectedIndex >= 0) {                                     
            String id = idField.getText();
            String name = nameField.getText();
            char gender = genderField.getText().charAt(0);
            Date birthday = new Date(); // You need to parse the date input
            Contact contact = new Contact(); // Create a Contact object

            Person updatedPerson = new Person(gender, birthday, id, name, contact);
            personList.set(selectedIndex, updatedPerson);
            listModel.set(selectedIndex, updatedPerson.toString());
        }
    }

    // Delete an existing person
    private void deletePerson() {
        int selectedIndex = personListView.getSelectedIndex();
        if (selectedIndex >= 0) {
            personList.remove(selectedIndex);
            listModel.remove(selectedIndex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PersonCRUDApp();
            }
        });
    }
}
