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

WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/Account icon'))

WebUI.delay(2)

WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Email'), 'suman.kompelly+1@diffagency.com')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('CR-DESKTOP/Home page/Login/Password'), '5xx1bkCcAlw=')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/Login button'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('CR-DESKTOP/Mega menu/SHOES'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/shoes - sneakers'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Collection page/product 3'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Add to wishlist'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/Account icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/a_Wishlist'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.mouseOver(findTestObject('CR-DESKTOP/Mega menu/SHOES'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Mega menu/shoes - sneakers'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Collection page/product 3'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/fast delivery - More info'))

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('CR-DESKTOP/product page/Easy returns - More info'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Specs Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/product page/Description'))

