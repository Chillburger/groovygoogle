import java.utils.*

import com.google.gdata.client.calendar.*
import com.google.gdata.data.calendar.*
import com.google.gdata.client.calendar.CalendarService
import com.google.gdata.client.*;
import com.google.gdata.data.acl.*
import com.google.gdata.data.*
import com.google.gdata.data.extensions.*
import com.google.gdata.util.*
import org.codehaus.groovy.runtime.TimeCategory

def googleId = "letitbespliced7@gmail.com"

def googlePass = "DpH2356!!"

def feedURL = "http://www.google.com/calendar/feeds/$myId/private/full"

use (TimeCategory, GDataCategory) { 


	def calService = new CalendarService("test-run-1.0")
	calService.setUserCredentials(googleId, googlePass)

	CalendarFeed result = calService.getFeed(feedURL, CalendarFeed.class)
	println "Now showing the calendar: "
	
	for (int i = 0; i < result.getEntries().size(); i++) {

		def entry = result.getEntries().get(i)
		println "\t ${entry.getTitle().getPlainText()}"

	}
}
