
**SugarOrm basic example**

If your device is Xiaomi and you have this error INSTALL_CANCELED_BY_USER:

 - Go to Settings -> Permissions -> Install via USB: Uncheck your App if it's listed.
 - Go to Settings -> Additional Settings -> Privacy: Check the Unknown Sources option.
 - **Finally go to Settings -> Additional Settings -> Developer options: Check the Install via USB option.**


Known Issues.
1. Instant Run.
Instant-Run seems to prevent Sugar ORM from finding the "table" classes, therefore it cannot create the DB tables if you run the app for the first time

When running your app for the first time Turn off Instant run once to allow for the DB tables to be created You can enable it after the tables have been created.

To disable Instant-Run in Android Studio:

(Preferences (Mac) or Settings (PC) -> Build, Execution, Deployment -> Instant Run -> Untick "Enable Instant Run..." )


Usual mistakes:

Check that your class child of Application extends from SugarApp or has inside the following lines
SugarContext.init(this);

Check that your Instant Run is disabled.

3 Check that your DOMAIN_PACKAGE_NAME set is correctly.

Check that after changes (add lines on Application or disabling Instant Run) you remove app from your phone or clear app data.

Check that version of your bd >= 2 (as stated on the website of the author)

Trying Build->Clean Project->Rebuild Project after changes. It's helped for me
