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

WebUI.click(findTestObject('CR-DESKTOP/Home page/Burger menu'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/SHOES'))

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

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/size -7'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(4)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.navigateToUrl('https://charlotterusse.com/')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Burger menu'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/a_Jeans'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/By fit'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/Jeans- Boy friend jeans'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Collection page/Product 2'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/size -18'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(4)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/size -20'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(4)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.navigateToUrl('https://charlotterusse.com/')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Burger menu'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/ACCESSORIES'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/accessories - Scarves'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Collection page/product 1'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Size - one size'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(3)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/Checkout'))

WebUI.callTestCase(findTestCase('CALL - CUTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CALL- SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

