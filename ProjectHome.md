JOIDS(Java OpenID Server) is a multi-domain, multi-user OpenID Provider based on [OpenID4Java](http://openid4java.org), [Spring Framework](http://springframework.org), [Hibernate](http://hibernate.org), [Velocity](http://velocity.apache.org/).

## Features ##
  * OpenID Identifier in the format http(s)://username.example.com or http(s)://example.com/username etc.
  * Multi-domain support.
  * Multi-user support.
  * Account management.
  * Multilingual support (now ba, de, en\_US, es, hr, ja, pt, sr, zh\_CN, zh\_HK, zh\_TW are available).

## Requirements ##
  * JDK 1.5+
  * A [servlet container](http://en.wikipedia.org/wiki/Java_Servlet#Servlet_containers) (such as [Apache Tomcat](http://tomcat.apache.org/), for more containers see [List of Servlet containers](http://en.wikipedia.org/wiki/List_of_Servlet_containers) on Wikipedia)
  * A database system (such as [PostgreSQL](http://www.postgresql.org/), [MySQL](http://www.mysql.com/) etc.)

## News ##
  * 2010-11-04 - the short name of Java OpenID Server changed from JOS to JOIDS [dʒɒidz], see [issue 25](https://code.google.com/p/openid-server/issues/detail?id=25)
  * 2010-04-23 - jos 1.2.1 released
> [Quick Install Guide](http://openid-server.googlecode.com/svn/tags/jos-1.2.1/INSTALL)

> New features:
    * Extended attributes modification for persona.
    * Add Bashkir, Chinese (Hong Kong), Chinese (Taiwan), Croatian, German, Serbian, Spanish support.
> Bugfixes and minor changes:
    * Trim email pattern of email address validator for email addition.
    * Shorten some column names of table jos\_password and jos\_email\_confirmation\_info as the maximum column length of Oracle is 30.
    * Some issues of parseUsername in subdirectory mode, see [issue 21](https://code.google.com/p/openid-server/issues/detail?id=21), [issue 23](https://code.google.com/p/openid-server/issues/detail?id=23).
    * Upgrade jquery from 1.2.6 to 1.4.2.
> Upgrade note:
    * Because of the maximum column length limit of Oracle, the following tables have been altered, so if you upgrade from version 1.2.0, the following instructions should be executed BEFORE the new WAR deployed:
```
    drop table jos_attribute_value;
    drop table jos_attribute;
    alter table jos_password rename password_maximum_service_times to password_max_service_times;
    alter table jos_email_confirmation_info rename email_confirmation_info_id to eci_id;
    alter table jos_email_confirmation_info rename email_confirmation_info_confirmation_code to eci_confirmation_code;
    alter table jos_email_confirmation_info rename email_confirmation_info_sent to eci_sent;
    alter table jos_email_confirmation_info rename email_confirmation_info_sent_date to eci_sent_date;
    alter table jos_email_confirmation_info rename email_confirmation_info_confirmed to eci_confirmed;
    alter table jos_email_confirmation_info rename email_confirmation_info_confirmed_date to eci_confirmed_date;
    alter table jos_email_confirmation_info rename email_confirmation_info_creation_date to eci_creation_date;
```


  * 2008-09-18 - jos 1.2.0 released
> [Quick Install Guide](http://openid-server.googlecode.com/svn/tags/jos-1.2.0/INSTALL) (ATTENTION: I made a mistake in it, in step 2 should be "Unpack to directory **/resources/jscalendar/** in the webapp" instead of "Unpack to directory /jscalendar/ in the webapp")

> New features:
    * Forgot password - generate a single-use password through register-email.
    * Password used times counting, last used date recording.
    * Domain configurator for adding new domain.
    * Add domain settings: inceptionYear, organization.name, orgnaization.url, privacy.url, defaultLocale.
    * Latest sites I logged on.
    * Top sites I logged on.
    * Latest sites of all users.
    * Add i18n-pt(Portuguese).
> Bugfixes and minor changes:
    * Use DecoratorController instead of VelocityDecoratorServlet.
    * Fix getIdentifierPrefix for subdirectory which returns double slashes.
    * Fix HTML validation errors: doctype and accesskey.
    * Add system reserved words, these words can't be registered by user.
    * Move all css, images, js to directory "resources".

&lt;wiki:gadget url="http://www.ohloh.net/p/22063/widgets/project\_users.xml" height="100" border="0"/&gt;