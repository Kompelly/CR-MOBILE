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

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart quantity increase - cart flyout'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart quantity increase - cart flyout'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart quantity increase - cart flyout'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart quantity increase - cart flyout'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('CR-DESKTOP/Cart flyout/Get price - subtotal'))

WebUI.delay(2)

WebUI.comment('a=' + a)

String a1 = a.substring(1)

WebUI.comment('a1=' + a1)

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart quantity decrease - cart flyout'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart quantity decrease - cart flyout'))

WebUI.delay(2)

WebUI.setText(findTestObject('CR-DESKTOP/Cart flyout/Input update - cart flyout'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/click outside'))

WebUI.delay(2)

String b = WebUI.getText(findTestObject('CR-DESKTOP/Cart flyout/Get price - subtotal'))

WebUI.delay(2)

WebUI.comment('b=' + b)

String b1 = b.substring(1)

WebUI.comment('b1=' + b1)

WebUI.delay(2)

double p1

double p2

// code to convert string to int
try {
    String str = a1

    WebUI.comment('str=' + str)

    p1 = Double.valueOf(str)

    WebUI.comment('p1=' + p1)
}
catch (NumberFormatException ex) {
} 

try {
    String str5 = b1

    WebUI.comment('str5=' + str5)

    p2 = Double.valueOf(str5)

    WebUI.comment('p2=' + p2)
}
catch (NumberFormatException ex) {
} 

boolean flag = WebUI.verifyNotEqual(p1, p2)

if (flag == true) {
    WebUI.comment('Quantity selector working')
} else {
    WebUI.comment('Quantity selector not working')
}

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/Checkout'))

WebUI.callTestCase(findTestCase('CALL - CUTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CALL- SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

