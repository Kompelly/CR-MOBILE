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

WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/a_View Addresses (0)'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/Add new address/button_Add a New Address'))

not_run: WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_First Name_addressfirst_'), 'xxx')

not_run: WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_Last Name_addresslast_na'), 'yyy')

not_run: WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_Company_addresscompany'), 'zzzz')

not_run: WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_Address 1_addressaddress'), '1435 saint alxendre')

not_run: WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_Address 2_addressaddress'), '399')

not_run: WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_City_addresscity'), 'montreal')

not_run: WebUI.selectOptionByValue(findTestObject('CR-DESKTOP/Home page/Login/Add new address/select_AlabamaAlaskaAmerican S'), 
    'New Jersey', true)

not_run: WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_PostalZip Code_addresszi'), '07057')

not_run: WebUI.setText(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_Phone_addressphone'), '5144493883')

not_run: WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/Add new address/input_Set as default address_b'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/Delete button'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/a_Return to Account Details'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/a_Wishlist'))

WebUI.back()

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Login/a_Logout'))

