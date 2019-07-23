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

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/store locator icon'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('CR-DESKTOP/Home page/Store Locator/Results total list'))

WebUI.comment('a=' + a)

WebUI.delay(2)

WebUI.setText(findTestObject('CR-DESKTOP/Home page/Store Locator/Search input'), '49418')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/Search'))

WebUI.delay(2)

String b = WebUI.getText(findTestObject('CR-DESKTOP/Home page/Store Locator/Results list after'))

WebUI.comment('b=' + b)

int k = 17

WebUI.verifyNotEqual('b', 'k')

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/Distance filter'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/Radio button'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/Filter'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/Label - until 9pm'))

WebUI.delay(2)

String c = WebUI.getText(findTestObject('CR-DESKTOP/Home page/Store Locator/Results list after filter'))

WebUI.comment('c=' + c)

WebUI.delay(2)

WebUI.verifyNotEqual('b', 'k')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/Clear filter'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/Next button'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Store Locator/Prev - button'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('CR-DESKTOP/Home page/Store Locator/select dropdown'), '2', true)

