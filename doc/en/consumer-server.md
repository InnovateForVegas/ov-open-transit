<!--
 Copyright (C) 2022 Innovate for Vegas Foundation
 
 This file is part of ov-open-transit.
 
 ov-open-transit is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.
 
 ov-open-transit is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 
 You should have received a copy of the GNU General Public License
 along with ov-open-transit.  If not, see <http://www.gnu.org/licenses/>.
-->

# Open Transit Consumer Server

We assume that a *Public Transit Consumer* will benefit from storing route preferences, use passes, funding source information (eg payment card), use statistics, and other information in a server such that they may access this information from multiple devices and in the event a device is lost or stolen, in a privacy aware manner.

In some cases, some consumer data may be useful to Operations Staff (Controllers), in which case the data in question would be anonymized to the extent that is possible and appropriate, and Consumer would be  aware which data are/were shared and would ideally be able to opt out of such sharing.

## Highest Priority Considerations

Consumer privacy is paramount. While there are some scenarios where Consumer data is going to be identifiable (eg payment information, email address, phone number for SMS, etc), it is critical to design all data retention and access schemes to avoid correlation of Consumer identity and location, as well as identity and schedule, by default. While it is useful to know that A Consumer has a particular schedule and travels regularly from some origin to some destination, with distance to stops and other services included, it is not essential to know the actual identity of that Consumer.

## Specification Details

## External Reference Materials

- [RTC website](https://www.rtcsnv.com/ways-to-travel/transit-services/for-developers/)

## User Stories

Individual stories may be converted into Issues, or consolidated or exploded as needed for development and implementation.

**Terms**:

- **Consumer**: a bus rider, bike share user, and so on.
- **Operator**: a bus driver, and so on.
- **Controller**: a transit operations staff member, and so on.
- **Company**: a transit company, commission, or other agency overseeing transit services

### Typical Uses

- **Card**: As a Consumer, I would like to store frequently-used bus route, schedule, and stop information across all of my devices.
  - **Conversation**: A frequent Consumer of transit services will often make use of the same routes at the same times on specific days of each week, month, etc. By storing that information the Consumer can access these data from a desktop web browser, on their mobile device, or perhaps other means (eg a voice interface on a so-called Smart Speaker).
  - **Confirmation**:
    - Consumer is able to access saved usage data via web browser on any device.
    - Consumer is able to access saved usage data from within a specific application on a supported device.

Converted to https://github.com/InnovateForVegas/ov-open-transit/issues/13

---

- **Card**: As a Consumer, I would like to receive notification of specific changes or other information regarding my stored routes across all devices and interfaces.
  - **Conversation**: A frequent Consumer of transit services will often assume that the same interactions day-to-day will be somewhat consistent and will plan their days and associated travel plans accordingly. These Consumers will benefit from proactive notifications regarding detours, schedule changes, stop changes, and so on, specific to their uses rather than introducing generic alerts and thus distracting noise.
  - **Confirmation**:
    - Consumer receives opt-in email, SMS, or other notification of any change to any saved route, stop, schedule, and so on, with enough time to make necessary adjustments to their travel.

Converted to https://github.com/InnovateForVegas/ov-open-transit/issues/14

---

- **Card**: As a Consumer, I would like to interact with my transit preferences and information using a Smart Speaker or other non-browser interfaces.
  - **Conversation**: There will be opportunities into the future to provide Consumers with additional methods of interaction with their transit use and data, to fit into their individual workflows. Integration with a device such as a Smart Speaker not only provides convenient access to personalized transit information for any user with that access method, but it also extends access to these data to a Consumer with impaired vision, in a usable way. A side effect, design for flexible application such as a Smart Speaker, implies design for flexible application for other devices, and thus service to more Consumers in more modes.
  - **Confirmation**:
    - A Consumer is able to receive schedule, route, and other pertinent information about their transit use via a Smart Speaker with voice-activated interface.
    - A Consumer is able to receive a general update on demand of their transit plans on the current day.
    - A Consumer is able to receive a specific update for a particular day in the future.

Converted to https://github.com/InnovateForVegas/ov-open-transit/issues/15

---
