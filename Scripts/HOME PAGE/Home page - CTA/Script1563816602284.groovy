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

String x = WebUI.getWindowTitle()

WebUI.comment('x=' + x)

String j = 'Charlotte Russe | New - Shop All New '

WebUI.comment('j=' + j)

if (x == j) {
    WebUI.comment(' right page ')
}

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/banner - slider'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Hero banner - 2nd'))

WebUI.delay(2)

String a = WebUI.getWindowTitle()

WebUI.comment('a=' + a)

String k = 'Charlotte Russe | Dresses - Shop All Dresses '

WebUI.comment('k=' + k)

if (a == k) {
    WebUI.comment(' right page ')
}

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Hero banner - 3 rd'))

WebUI.delay(2)

String b = WebUI.getWindowTitle()

String k1 = 'Charlotte Russe | Shoes - Shop All Shoes '

if (b == k1) {
    WebUI.comment(' right page ')
}

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/middle tile - home page'))

WebUI.delay(2)

String c = WebUI.getWindowTitle()

String k2 = 'Charlotte Russe | Clothes - Sets '

if (c == k2) {
    WebUI.comment(' right page ')
}

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/First tile- home page'))

WebUI.delay(2)

String d = WebUI.getWindowTitle()

String k3 = 'Charlotte Russe | Clothes - Shop All Tops '

if (d == k3) {
    WebUI.comment(' right page ')
}

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Charlotte russe icon'))

WebUI.delay(2)

WebUI.click(findTestObject('CR-DESKTOP/Home page/Second tile- home page'))

WebUI.delay(2)

String e = WebUI.getWindowTitle()

String k4 = 'Charlotte Russe | Plus Sizes - Shop All Plus Sizes '

if (e == k4) {
    WebUI.comment(' right page ')
}

WebUI.delay(2)

