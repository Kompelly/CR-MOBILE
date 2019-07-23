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

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/Email'), 'suman@gmail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/First name'), 'suman')

WebUI.delay(1)

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/Last name'), 'kompelly')

WebUI.delay(1)

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/Address'), '123 saint alxendre')

WebUI.delay(1)

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/apt suite'), '199')

WebUI.delay(1)

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/City'), 'montreal')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('CR-DESKTOP/Customer info page/state dropdown'), 'NJ', true)

WebUI.delay(1)

WebUI.setText(findTestObject('CR-DESKTOP/Customer info page/Zip code'), '07057')

