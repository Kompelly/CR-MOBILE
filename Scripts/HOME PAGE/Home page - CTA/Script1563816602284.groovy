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

WebUI.getWindowTitle()

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/banner - slider'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Hero banner - 2nd'))

WebUI.delay(2)

String a = WebUI.getWindowTitle()

WebUI.comment('a=' + a)

String k = 'Charlotte Russe | Dresses - Shop All Dresses '

WebUI.comment('k=' + k)

WebUI.verifyMatch('a', 'k', false)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Hero banner - 3 rd'))

WebUI.delay(2)

String b = WebUI.getWindowTitle()

String k1 = 'Charlotte Russe | Shoes - Shop All Shoes '

WebUI.verifyEqual('b', 'k1')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/middle tile - home page'))

WebUI.delay(2)

String c = WebUI.getWindowTitle()

String k2 = 'Charlotte Russe | Clothes - Sets '

WebUI.verifyEqual('c', 'k2')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/First tile- home page'))

WebUI.delay(2)

String d = WebUI.getWindowTitle()

String k3 = 'Charlotte Russe | Clothes - Shop All Tops '

WebUI.verifyEqual('d', 'k3')

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Second tile- home page'))

WebUI.delay(2)

String e = WebUI.getWindowTitle()

String k4 = 'Charlotte Russe | Plus Sizes - Shop All Plus Sizes '

WebUI.verifyEqual('e', 'k4')

