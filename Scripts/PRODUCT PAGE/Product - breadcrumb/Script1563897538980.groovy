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

String d = WebUI.getWindowTitle()

WebUI.comment(' d= ' + d)

String k5 = 'Quilted Faux-Leather Slip On Sneaker – Charlotte Russe'

WebUI.comment(' k5= ' + k5)

if (d == k5) {
	WebUI.comment('right page ')
}

WebUI.click(findTestObject('CR-DESKTOP/product page/Sneakers lin k'))

String a = WebUI.getWindowTitle()

WebUI.comment(' a= ' + a)

String k = 'Charlotte Russe | Shoes - Shop Sneakers'

WebUI.comment(' k= ' + k)

if (a == k) {
    WebUI.comment('right page ')
}

WebUI.click(findTestObject('CR-DESKTOP/Collection page/shoes link'))

String b = WebUI.getWindowTitle()

WebUI.comment(' b= ' + b)

String k1 = 'Charlotte Russe | Shoes - Shop All Shoes'

WebUI.comment(' k1= ' + k1)

if (b == k1) {
    WebUI.comment('right page ')
}

WebUI.click(findTestObject('CR-DESKTOP/Collection page/Home link'))

String c = WebUI.getWindowTitle()

WebUI.comment(' c= ' + c)

String k3 = 'Charlotte Russe'

WebUI.comment(' k3= ' + k3)

if (c == k3) {
    WebUI.comment('right page ')
}

