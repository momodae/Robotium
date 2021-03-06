package quant.robotiumlibrary;

import android.app.Activity;
import android.app.Instrumentation;
import android.graphics.PointF;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.TimePicker;

import com.robotium.solo.By;
import com.robotium.solo.Condition;
import com.robotium.solo.Illustration;
import com.robotium.solo.WebElement;

import java.util.ArrayList;

import quant.robotiumlibrary.annotation.FutureMethod;

/**
 * Created by cz on 2017/3/17.
 * 以下接口方法,由代码生成,为实现动态代理,劫持方法调用
 */
public interface ISolo {
    Instrumentation.ActivityMonitor getActivityMonitor();
    SoloConfig getConfig();
    ArrayList<View> getViews();
    ArrayList<View> getViews(@Param("parent") View parent);
    View getTopParent(@Param("view") View view);
    boolean waitForText(@Param("text") String text);
    boolean waitForText(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") long timeout);
    boolean waitForText(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") long timeout, @Param("scroll") boolean scroll);
    boolean waitForText(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") long timeout, @Param("scroll") boolean scroll, @Param("onlyVisible") boolean onlyVisible);
    boolean waitForView(@Param("id") int id);
    boolean waitForView(@Param("id") int id, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") int timeout);
    boolean waitForView(@Param("id") int id, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") int timeout, @Param("scroll") boolean scroll);
    boolean waitForView(@Param("tag") Object tag);
    boolean waitForView(@Param("tag") Object tag, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") int timeout);
    boolean waitForView(@Param("tag") Object tag, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") int timeout, @Param("scroll") boolean scroll);
    <T extends View> boolean waitForView(@Param("viewClass") Class<T> viewClass);
    <T extends View> boolean waitForView(@Param("view") View view);
    <T extends View> boolean waitForView(@Param("view") View view, @Param("timeout") int timeout, @Param("scroll") boolean scroll);
    <T extends View> boolean waitForView(@Param("viewClass") Class<T> viewClass, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") int timeout);
    <T extends View> boolean waitForView(@Param("viewClass") Class<T> viewClass, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") int timeout, @Param("scroll") boolean scroll);
    boolean waitForWebElement(@Param("by") By by);
    boolean waitForWebElement(@Param("by") By by, @Param("timeout") int timeout, @Param("scroll") boolean scroll);
    boolean waitForWebElement(@Param("by") By by, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("timeout") int timeout, @Param("scroll") boolean scroll);
    boolean waitForCondition(@Param("condition") Condition condition, @Param("timeout") int timeout);
    boolean searchEditText(@Param("text") String text);
    boolean searchButton(@Param("text") String text);
    boolean searchButton(@Param("text") String text, @Param("onlyVisible") boolean onlyVisible);
    boolean searchToggleButton(@Param("text") String text);
    boolean searchButton(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches);
    boolean searchButton(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("onlyVisible") boolean onlyVisible);
    boolean searchToggleButton(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches);
    boolean searchText(@Param("text") String text);
    boolean searchText(@Param("text") String text, @Param("onlyVisible") boolean onlyVisible);
    boolean searchText(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches);
    boolean searchText(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("scroll") boolean scroll);
    boolean searchText(@Param("text") String text, @Param("minimumNumberOfMatches") int minimumNumberOfMatches, @Param("scroll") boolean scroll, @Param("onlyVisible") boolean onlyVisible);
    void setActivityOrientation(@Param("orientation") int orientation);
    Activity getCurrentActivity();
    void assertCurrentActivity(@Param("message") String message, @Param("name") String name);
    void assertCurrentActivity(@Param("message") String message, @Param("activityClass") Class activityClass);
    void assertCurrentActivity(@Param("message") String message, @Param("name") String name, @Param("isNewInstance") boolean isNewInstance);
    void assertCurrentActivity(@Param("message") String message, @Param("activityClass") Class activityClass, boolean isNewInstance);
    void assertMemoryNotLow();
    boolean waitForDialogToOpen();
    boolean waitForDialogToClose();
    boolean waitForDialogToOpen(@Param("timeout") long timeout);
    boolean waitForDialogToClose(@Param("timeout") long timeout);
    void goBack();
    void clickOnScreen(@Param("x") float x, @Param("y") float y);
    void clickOnScreen(@Param("x") float x, @Param("y") float y, @Param("numberOfClicks") int numberOfClicks);
    void clickLongOnScreen(@Param("x") float x, @Param("y") float y);
    void clickLongOnScreen(@Param("x") float x, @Param("y") float y, @Param("time") int time);
    void clickOnButton(@Param("text") String text);
    void clickOnImageButton(@Param("index") int index);
    void clickOnToggleButton(@Param("text") String text);
    void clickOnMenuItem(@Param("text") String text);
    void clickOnMenuItem(@Param("text") String text, @Param("subMenu") boolean subMenu);
    void clickOnWebElement(@Param("webElement") WebElement webElement);
    void clickOnWebElement(@Param("by") By by);
    void clickOnWebElement(@Param("by") By by, @Param("match") int match);
    void clickOnWebElement(@Param("by") By by, @Param("match") int match, @Param("scroll") boolean scroll);
    void pressMenuItem(@Param("index") int index);
    void pressMenuItem(@Param("index") int index, @Param("itemsPerRow") int itemsPerRow);
    void pressSoftKeyboardNextButton();
    void pressSoftKeyboardSearchButton();
    void pressSoftKeyboardGoButton();
    void pressSoftKeyboardDoneButton();
    void pressSpinnerItem(@Param("spinnerIndex") int spinnerIndex, @Param("itemIndex") int itemIndex);
    void clickOnView(@Param("view") View view);
    void clickOnView(@Param("view") View view, @Param("immediately") boolean immediately);
    void clickLongOnView(@Param("view") View view);
    void clickLongOnView(@Param("view") View view, @Param("time") int time);
    void clickOnText(@Param("text") String text);
    void clickOnText(@Param("text") String text, @Param("match") int match);
    void clickOnText(@Param("text") String text, @Param("match") int match, @Param("scroll") boolean scroll);
    void clickLongOnText(@Param("text") String text);
    void clickLongOnText(@Param("text") String text, @Param("match") int match);
    void clickLongOnText(@Param("text") String text, @Param("match") int match, @Param("scroll") boolean scroll);
    void clickLongOnText(@Param("text") String text, @Param("match") int match, @Param("time") int time);
    void clickLongOnTextAndPress(@Param("text") String text, @Param("index") int index);
    void clickOnButton(@Param("index") int index);
    void clickOnRadioButton(@Param("index") int index);
    void clickOnCheckBox(@Param("index") int index);
    void clickOnEditText(@Param("index") int index);
    ArrayList<TextView> clickInList(@Param("line") int line);
    ArrayList<TextView> clickInList(@Param("line") int line, @Param("index") int index);
    void clickInList(@Param("line") int line, @Param("index") int index, @Param("id") int id);
    ArrayList<TextView> clickLongInList(@Param("line") int line);
    ArrayList<TextView> clickLongInList(@Param("line") int line, @Param("index") int index);
    ArrayList<TextView> clickLongInList(@Param("line") int line, @Param("index") int index, @Param("time") int time);
    ArrayList<TextView> clickInRecyclerView(@Param("itemIndex") int itemIndex);
    ArrayList<TextView> clickInRecyclerView(@Param("itemIndex") int itemIndex, @Param("recyclerViewIndex") int recyclerViewIndex);
    void clickInRecyclerView(@Param("itemIndex") int itemIndex, @Param("recyclerViewIndex") int recyclerViewIndex, @Param("id") int id);
    ArrayList<TextView> clickLongInRecycleView(@Param("itemIndex") int itemIndex);
    ArrayList<TextView> clickLongInRecycleView(@Param("itemIndex") int itemIndex, @Param("recyclerViewIndex") int recyclerViewIndex);
    ArrayList<TextView> clickLongInRecycleView(@Param("itemIndex") int itemIndex, @Param("recyclerViewIndex") int recyclerViewIndex, @Param("time") int time);
    void clickOnActionBarItem(@Param("id") int id);
    void clickOnActionBarHomeButton();
    Illustration.Builder createIllustrationBuilder();
    void illustrate(@Param("illustration") Illustration illustration);
    void drag(@Param("fromX") float fromX, @Param("toX") float toX, @Param("fromY") float fromY, @Param("toY") float toY, @Param("stepCount") int stepCount);
    boolean scrollDown();
    void scrollToBottom();
    boolean scrollUp();
    void scrollToTop();
    boolean scrollDownList(@Param("list") AbsListView list);
    boolean scrollListToBottom(@Param("list") AbsListView list);
    boolean scrollUpList(@Param("list") AbsListView list);
    boolean scrollListToTop(@Param("list") AbsListView list);
    boolean scrollDownList(@Param("index") int index);
    boolean scrollListToBottom(@Param("index") int index);
    boolean scrollUpList(@Param("index") int index);
    boolean scrollListToTop(@Param("index") int index);
    void scrollListToLine(@Param("absListView") AbsListView absListView, @Param("line") int line);
    void scrollListToLine(@Param("index") int index, @Param("line") int line);
    boolean scrollDownRecyclerView(@Param("index") int index);
    boolean scrollRecyclerViewToBottom(@Param("index") int index);
    boolean scrollUpRecyclerView(@Param("index") int index);
    boolean scrollRecyclerViewToTop(@Param("index") int index);
    void scrollToSide(@Param("side") int side, @Param("scrollPosition") float scrollPosition, @Param("stepCount") int stepCount);
    void scrollToSide(@Param("side") int side, @Param("scrollPosition") float scrollPosition);
    void scrollToSide(@Param("side") int side);
    void scrollViewToSide(@Param("view") View view, @Param("side") int side, @Param("scrollPosition") float scrollPosition, @Param("stepCount") int stepCount);
    void scrollViewToSide(@Param("view") View view, @Param("side") int side, @Param("scrollPosition") float scrollPosition);
    void scrollViewToSide(@Param("view") View view, @Param("side") int side);
    void pinchToZoom(@Param("startPoint1") PointF startPoint1, @Param("startPoint2") PointF startPoint2, @Param("endPoint1") PointF endPoint1, @Param("endPoint2") PointF endPoint2);
    void swipe(@Param("startPoint1") PointF startPoint1, @Param("startPoint2") PointF startPoint2, @Param("endPoint1") PointF endPoint1, @Param("endPoint2") PointF endPoint2);
    void rotateLarge(@Param("center1") PointF center1, @Param("center2") PointF center2);
    void rotateSmall(@Param("center1") PointF center1, @Param("center2") PointF center2);
    void setMobileData(@Param("turnedOn") Boolean turnedOn);
    void setWiFiData(@Param("turnedOn") Boolean turnedOn);
    void setDatePicker(@Param("index") int index, @Param("year") int year, @Param("monthOfYear") int monthOfYear, @Param("dayOfMonth") int dayOfMonth);
    void setDatePicker(@Param("datePicker") DatePicker datePicker, @Param("year") int year, @Param("monthOfYear") int monthOfYear, @Param("dayOfMonth") int dayOfMonth);
    void setTimePicker(@Param("index") int index, @Param("hour") int hour, @Param("minute") int minute);
    void setTimePicker(@Param("timePicker") TimePicker timePicker, @Param("hour") int hour, @Param("minute") int minute);
    void setProgressBar(@Param("index") int index, @Param("progress") int progress);
    void setProgressBar(@Param("progressBar") ProgressBar progressBar, @Param("progress") int progress);
    void setNavigationDrawer(@Param("status") int status);
    void setSlidingDrawer(@Param("index") int index, @Param("status") int status);
    void setSlidingDrawer(@Param("slidingDrawer") SlidingDrawer slidingDrawer, @Param("status") int status);
    void enterText(@Param("index") int index, @Param("text") String text);
    void enterText(@Param("editText") EditText editText, @Param("text") String text);
    void enterTextInWebElement(@Param("by") By by, @Param("text") String text);
    void typeText(@Param("index") int index, @Param("text") String text);
    void typeText(@Param("editText") EditText editText, @Param("text") String text);
    void typeTextInWebElement(@Param("by") By by, @Param("text") String text);
    void typeTextInWebElement(@Param("by") By by, @Param("text") String text, @Param("match") int match);
    void typeTextInWebElement(@Param("webElement") WebElement webElement, @Param("text") String text);
    void clearEditText(@Param("index") int index);
    void clearEditText(@Param("editText") EditText editText);
    void clearTextInWebElement(@Param("by") By by);
    void clickOnImage(@Param("index") int index);
    EditText getEditText(@Param("index") int index);
    Button getButton(@Param("index") int index);
    TextView getText(@Param("index") int index);
    ImageView getImage(@Param("index") int index);
    ImageButton getImageButton(@Param("index") int index);
    TextView getText(@Param("text") String text);
    TextView getText(@Param("text") String text, @Param("onlyVisible") boolean onlyVisible);
    Button getButton(@Param("text") String text);
    Button getButton(@Param("text") String text, @Param("onlyVisible") boolean onlyVisible);
    EditText getEditText(@Param("text") String text);
    EditText getEditText(@Param("text") String text, @Param("onlyVisible") boolean onlyVisible);
    View getView(@Param("id") int id);
    View getView(@Param("id") int id, @Param("index") int index);
    View getView(@Param("tag") Object tag);
    View getView(@Param("tag") Object tag, @Param("index") int index);
    View getView(@Param("id") String id);
    View getView(@Param("id") String id, @Param("index") int index);
    <T extends View> T getView(@Param("viewClass") Class<T> viewClass, @Param("index") int index);
    WebElement getWebElement(@Param("by") By by, @Param("index") int index);
    String getWebUrl();
    ArrayList<View> getCurrentViews();
    <T extends View> ArrayList<T> getCurrentViews(@Param("classToFilterBy") Class<T> classToFilterBy);
    <T extends View> ArrayList<T> getCurrentViews(@Param("classToFilterBy") Class<T> classToFilterBy, @Param("includeSubclasses") boolean includeSubclasses);
    <T extends View> ArrayList<T> getCurrentViews(@Param("classToFilterBy") Class<T> classToFilterBy, @Param("parent") View parent);
    <T extends View> ArrayList<T> getCurrentViews(@Param("classToFilterBy") Class<T> classToFilterBy, @Param("includeSubclasses") boolean includeSubclasses, @Param("parent") View parent);
    ArrayList<WebElement> getWebElements();
    ArrayList<WebElement> getWebElements(@Param("by") By by);
    ArrayList<WebElement> getCurrentWebElements();
    ArrayList<WebElement> getCurrentWebElements(@Param("by") By by);
    boolean isRadioButtonChecked(@Param("index") int index);
    boolean isRadioButtonChecked(@Param("text") String text);
    boolean isCheckBoxChecked(@Param("index") int index);
    boolean isToggleButtonChecked(@Param("text") String text);
    boolean isToggleButtonChecked(@Param("index") int index);
    boolean isCheckBoxChecked(@Param("text") String text);
    boolean isTextChecked(@Param("text") String text);
    boolean isSpinnerTextSelected(@Param("text") String text);
    boolean isSpinnerTextSelected(@Param("index") int index, @Param("text") String text);
    void hideSoftKeyboard();
    void unlockScreen();
    void sendKey(@Param("key") int key);
    void goBackToActivity(@Param("name") String name);
    boolean waitForActivity(@Param("name") String name);
    boolean waitForActivity(@Param("name") String name, @Param("timeout") int timeout);
    boolean waitForActivity(@Param("extends") Class<? extends Activity> activityClass);
    boolean waitForActivity(@Param("extends") Class<? extends Activity> activityClass, @Param("timeout") int timeout);
    boolean waitForEmptyActivityStack(@Param("timeout") int timeout);
    boolean waitForFragmentByTag(@Param("tag") String tag);
    boolean waitForFragmentByTag(@Param("tag") String tag, @Param("timeout") int timeout);
    boolean waitForFragmentById(@Param("id") int id);
    boolean waitForFragmentById(@Param("id") int id, @Param("timeout") int timeout);
    boolean waitForLogMessage(@Param("logMessage") String logMessage);
    boolean waitForLogMessage(@Param("logMessage") String logMessage, @Param("timeout") int timeout);
    void clearLog();
    String getString(@Param("id") int id);
    String getString(@Param("id") String id);
    void sleep(@Param("time") int time);
    void finalize() throws Throwable;
    void finishOpenedActivities();
    void takeScreenshot();
    void takeScreenshot(@Param("name") String name);
    void takeScreenshot(@Param("name") String name, @Param("quality") int quality);
    void startScreenshotSequence(@Param("name") String name);
    void startScreenshotSequence(@Param("name") String name, @Param("quality") int quality, @Param("frameDelay") int frameDelay, @Param("maxFrames") int maxFrames);
    void stopScreenshotSequence();

    //-------------------------------手动动定添加方法-------------------------------

    /**
     * 起始绕过权限
     */
    @FutureMethod
    void acrossForPermission(@Param("instrumentation") Instrumentation instrumentation);

    /**
     * 自动遍历
     */
    @FutureMethod
    void autoIterator(@Param("instrumentation") Instrumentation instrumentation);

    boolean waitActivityChanged();

    boolean waitActivityChanged(@Param("timeout") int timeout);

    boolean waitListChanged(ListView listView, @Param("timeout") int timeout);


}
