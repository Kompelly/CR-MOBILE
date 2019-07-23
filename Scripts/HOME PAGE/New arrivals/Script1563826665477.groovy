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

WebUI.scrollToElement(findTestObject('CR-DESKTOP/Home page/New arrivals/New arrivals'), 0)

WebUI.delay(2)

for (i = 1; i <= 3; i++) {
    WebUI.click(findTestObject('CR-DESKTOP/Home page/New arrivals/Next button'))
}

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/New arrivals/Previous button'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/New arrivals/product image'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('CR-DESKTOP/Home page/New arrivals/New arrivals'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Recomended for you/Second slider'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Recomended for you/Third slider'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Recomended for you/Fourth slider'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Recomended for you/First slider'))

