//
// Swiss QR Bill Generator
// Copyright (c) 2017 Manuel Bleichenbacher
// Licensed under MIT License
// https://opensource.org/licenses/MIT
//
package net.codecrete.qrbill.generatortest;

import net.codecrete.qrbill.generator.Address;
import net.codecrete.qrbill.generator.AlternativeScheme;
import net.codecrete.qrbill.generator.Bill;
import net.codecrete.qrbill.generator.Language;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Generates valid sample bill data.
 */
class SampleData {

    static Bill getExample1() {
        Bill bill = new Bill();
        bill.getFormat().setLanguage(Language.EN);
        bill.setAccount("CH44 3199 9123 0008  89012");
        Address creditor = new Address();
        creditor.setName("Robert Schneider AG");
        creditor.setStreet("Rue du Lac");
        creditor.setHouseNo("1268/2/22");
        creditor.setPostalCode("2501");
        creditor.setTown("Biel");
        creditor.setCountryCode("CH");
        bill.setCreditor(creditor);
        bill.setAmount(new BigDecimal(123949.75).setScale(2, RoundingMode.HALF_UP));
        bill.setCurrency("CHF");
        Address debtor = new Address();
        debtor.setName("Pia-Maria Rutschmann-Schnyder");
        debtor.setStreet("Grosse Marktgasse");
        debtor.setHouseNo("28");
        debtor.setPostalCode("9400");
        debtor.setTown(" Rorschach");
        debtor.setCountryCode("CH");
        bill.setDebtor(debtor);
        bill.setReference("210000 000 00313 9471430009017");
        bill.setUnstructuredMessage("Instruction of 15.09.2019");
        bill.setBillInformation("//S1/01/20170309/11/10201409/20/14000000/22/36958/30/CH106017086/40/1020/41/3010");
        bill.setAlternativeSchemes(new AlternativeScheme[] {
                new AlternativeScheme("Ultraviolet", "UV;UltraPay005;12345"),
                new AlternativeScheme("Xing Yong", "XY;XYService;54321")
        });
        return bill;
    }

    static Bill getExample2() {
        Bill bill = new Bill();
        bill.getFormat().setLanguage(Language.DE);
        bill.setAccount("CH3709000000304442225");
        Address creditor = new Address();
        creditor.setName("Salvation Army Foundation Switzerland");
        creditor.setStreet(null);
        creditor.setHouseNo(null);
        creditor.setPostalCode("3000");
        creditor.setTown("Berne");
        creditor.setCountryCode("CH");
        bill.setCreditor(creditor);
        bill.setAmount(null);
        bill.setCurrency("CHF");
        bill.setDebtor(null);
        bill.setReference("");
        bill.setUnstructuredMessage("Donation to the Winterfest Campaign");
        return bill;
    }

    static Bill getExample3() {
        Bill bill = new Bill();
        bill.getFormat().setLanguage(Language.FR);
        bill.setAccount("CH74 0070 0110 0061 1600 2");
        Address creditor = new Address();
        creditor.setName("Robert Schneider AG");
        creditor.setStreet("Rue du Lac");
        creditor.setHouseNo("1268/2/22");
        creditor.setPostalCode("2501");
        creditor.setTown("Biel");
        creditor.setCountryCode("CH");
        bill.setCreditor(creditor);
        bill.setAmount(new BigDecimal(19995).movePointLeft(2));
        bill.setCurrency("CHF");
        Address debtor = new Address();
        debtor.setName("Pia-Maria Rutschmann-Schnyder");
        debtor.setStreet("Grosse Marktgasse");
        debtor.setHouseNo("28");
        debtor.setPostalCode("9400");
        debtor.setTown("Rorschach");
        debtor.setCountryCode("CH");
        bill.setDebtor(debtor);
        bill.setReference("RF18539007547034");
        bill.setUnstructuredMessage(null);
        return bill;
    }

    static Bill getExample4() {
        Bill bill = new Bill();
        bill.getFormat().setLanguage(Language.IT);
        bill.setAccount("CH3709000000304442225");
        Address creditor = new Address();
        creditor.setName("ABC AG");
        creditor.setStreet(null);
        creditor.setHouseNo(null);
        creditor.setPostalCode("3000");
        creditor.setTown("Bern");
        creditor.setCountryCode("CH");
        bill.setCreditor(creditor);
        bill.setAmount(null);
        bill.setCurrency("CHF");
        bill.setDebtor(null);
        bill.setReference("");
        bill.setUnstructuredMessage("");
        return bill;
    }

    static Bill getExample5() {
        Bill bill = new Bill();
        bill.getFormat().setLanguage(Language.EN);
        bill.setAccount("CH44 3199 9123 0008  89012");
        Address creditor = new Address();
        creditor.setName("Ambikaipagan & Deepshikha Thirugnanasampanthamoorthy");
        creditor.setAddressLine1("c/o Pereira De Carvalho, Conrad-Ferdinand-Meyer-Strasse 317 Wohnung 7B");
        creditor.setAddressLine2("9527 Niederhelfenschwil bei Schönholzerswilen SG");
        creditor.setCountryCode("CH");
        bill.setCreditor(creditor);
        bill.setAmount(new BigDecimal(987654321.50).setScale(2, RoundingMode.HALF_UP));
        bill.setCurrency("CHF");
        Address debtor = new Address();
        debtor.setName("Annegret Karin & Hansruedi Frischknecht-Bernhardsgrütter");
        debtor.setAddressLine1("1503 South New Hampshire Avenue, Lower East-side Bellvue");
        debtor.setAddressLine2("Poughkeepsie NY 12601-1233");
        debtor.setCountryCode("US");
        bill.setDebtor(debtor);
        bill.setReference("210000 000 00313 9471430009017");
        bill.setUnstructuredMessage("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed");
        bill.setBillInformation("//S1/01/20170309/11/10201409/20/14000000/22/36958/30/CH106017086/40/1020/41/3010/01/20170309/11/10201409/20/14000000/22/36958/30/CH106017086/40/1020/41/3010");
        return bill;
    }

    static Bill getExample6() {
        Bill bill = new Bill();
        bill.getFormat().setLanguage(Language.EN);
        bill.setAccount("CH44 3199 9123 0008  89012");
        Address creditor = new Address();
        creditor.setName("Ambikaipagan & Deepshikha Thirugnanasampanthamoorthy");
        creditor.setAddressLine1("c/o Pereira De Carvalho, Conrad-Ferdinand-Meyer-Strasse 317 Wohnung 7B");
        creditor.setAddressLine2("9527 Niederhelfenschwil bei Schönholzerswilen SG");
        creditor.setCountryCode("CH");
        bill.setCreditor(creditor);
        bill.setCurrency("EUR");
        bill.setReference("210000 000 00313 9471430009017");
        bill.setUnstructuredMessage("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed");
        bill.setBillInformation("//S1/01/20170309/11/10201409/20/14000000/22/36958/30/CH106017086/40/1020/41/3010/01/20170309/11/10201409/20/14000000/22/36958/30/CH106017086/40/1020/41/3010");
        return bill;
    }
}
