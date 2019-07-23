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

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Contact Us'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Track Order'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Shipping Info'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Return Policy'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_About Us'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Careers'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Terms  Conditions'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Privacy Policy'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Social Media Policy'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_FAQs'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Size Chart'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Find a Store'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Facebook'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/twitter'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Instagram'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Pintrest'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/youtube'))

WebUI.delay(2)

WebUI.setText(findTestObject('CR-DESKTOP/Home page/Footer/Input'), 'suman@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/button_Sign Up'))

WebUI.delay(2)

WebUI.getText(findTestObject('CR-DESKTOP/Home page/Footer/div_Thank you for subscribing'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Store locator'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Contact us'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Track package'))

