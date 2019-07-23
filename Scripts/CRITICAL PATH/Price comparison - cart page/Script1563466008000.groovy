import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CALL-URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('CR-DESKTOP/Mega menu/SHOES'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/shoes - sneakers'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Collection page/product 3'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/White color variant'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Size -6'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(2)

WebUI.setText(findTestObject('CR-DESKTOP/Cart flyout/Input update - cart flyout'), '8')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart collpase'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('CR-DESKTOP/Mega menu/a_Jeans'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/Jeans- Boy friend jeans'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Collection page/Product 2'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/size -18'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/Checkout'))

WebUI.delay(3)

WebUI.click(findTestObject('CR-DESKTOP/Customer info page/cart page link'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('CR-DESKTOP/Cart page/Get price - prod 1-cart page'))

WebUI.delay(2)

WebUI.comment('a=' + a)

String a1 = a.substring(1)

WebUI.comment('a1=' + a1)

double p1

double p2

double p3

// code to convert string to int
try {
    String str = a1

    WebUI.comment('str=' + str)

    p1 = Double.valueOf(str)

    WebUI.comment('p1=' + p1)
}
catch (NumberFormatException ex) {
} 

String b = WebUI.getText(findTestObject('CR-DESKTOP/Cart page/Get price - prod 2 - cart page'))

WebUI.delay(2)

WebUI.comment('b=' + b)

String b1 = b.substring(1)

WebUI.comment('b1=' + b1)

WebUI.delay(2)

try {
    String str5 = b1

    WebUI.comment('str5=' + str5)

    p2 = Double.valueOf(str5)

    WebUI.comment('p2=' + p2)
}
catch (NumberFormatException ex) {
} 

int total = p1 + p2

WebUI.comment('total=' + total)

String c = WebUI.getText(findTestObject('CR-DESKTOP/Cart page/Get price - subtotal- cart page'))

WebUI.delay(2)

WebUI.comment('c=' + c)

String c1 = c.substring(1)

WebUI.comment('c1=' + c1)

try {
    String ctr = c1

    WebUI.comment('ctr=' + ctr)

    p3 = Double.valueOf(ctr)

    WebUI.comment('p3=' + p3)
}
catch (NumberFormatException ex) {
} 

WebUI.verifyEqual(p3, total)

WebUI.click(findTestObject('CR-DESKTOP/Cart page/Check out - cart page'))

WebUI.callTestCase(findTestCase('CALL - CUTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CALL- SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

