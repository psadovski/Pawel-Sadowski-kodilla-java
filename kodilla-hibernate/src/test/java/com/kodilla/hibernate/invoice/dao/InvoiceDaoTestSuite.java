package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");
        Product product4 = new Product("Product4");
        Item item1 = new Item(new BigDecimal(100), 1, new BigDecimal(100));
        Item item2 = new Item(new BigDecimal(50), 4, new BigDecimal(200));
        Item item3 = new Item(new BigDecimal(150), 2, new BigDecimal(300));
        Item item4 = new Item(new BigDecimal(200), 2, new BigDecimal(400));
        Invoice invoice = new Invoice("Invoice");

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product4.getItems().add(item4);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product4);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        try {
            invoiceDao.delete(invoice);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
