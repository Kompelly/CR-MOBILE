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

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Hero banner - 1 st'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/1 st product'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Black variant'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Size - SP'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart collpase'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Hero banner - 2nd'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/2 nd product'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Size - 16'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/cart collpase'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/middle tile - home page'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/3 rd product'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Neon orange varaint'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Size - SP'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Cart flyout/Checkout'))

WebUI.callTestCase(findTestCase('CALL - CUTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CALL- SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

