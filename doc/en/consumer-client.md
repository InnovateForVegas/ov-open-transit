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

# Open Transit Consumer Client Tools

We assume that a *Public Transit Consumer* is riding in a van, bus, or other vehicle from point to point, and/or using bicycle sharing and other transportation services in hybrid fashion as needed.

We assume that payment for consumption and use of these services may be made through the client tools via credit card or similar, and that processing the pass or similar token of service may take place between the client and a vehicle (optical or other scanning of a QR code or similar), or may be based on other means (eg GPS-based billing, timed intervals of bicycle use, distance traveled, etc).

## Highest Priority Considerations

The consumer client tools must always be correct, or must inform the consumer with as much information as possible when correct is not possible.

For example, if a transit vehicle is sending real-time location data to the real time transit servers and that data suddenly becomes unavailable, the consumer client must indicate clearly that the vehicle is no longer transmitting data, so that any indication of vehicle position is marked as a location estimate, with estimated arrival times marked as dubious.

Equally important, the consumer client must be accessible, and must not depend on small details, low-contrast color cues, or unclear cues in general that may be difficult to read in sunlight in any case, or for a consumer with limited vision.

The consumer client tools should be built with the assumption that they will be used in the worst cases, including bad weather, late or missing vehicles when consumer is late for an important trip to school, work, etc, late at night or early in the morning when people are prone to frustration, and so on. All consumer client tools, and the services that enable them, must be architected to make an informed journey the hightest priority at all times, accessible and correct, and enabling the consumer to communicate situational details to enable continuous improvement and confidence in the transit system.

## Specification Details

Tools for Consumers of transit services should be designed with considerations of the following:

- Accuracy and reliability. Trusting information, that it is correct, is essential.
- Usability, including a user/rider experience that is useful in real time (eg when attempting to catch THIS bus)
- Accessibility, including
  - appropriate WAI-ARIA and visual attributes compatible with a variety of eye sight limitations
  - audio components and screen-reader compatibility
- Language flexibility with i18n and l10n considerations

The current (as of 2022) software client approach taken in the Las Vegas transit area, is to deploy multiple applications, developed by multiple vendors, to accomplish groups of tasks:

- TransitApp for managing schedule and real time update information for the rider
- RTC Transit Watch to report issues
- RideRTC to purchase tickets and obtain official RTC SNV information and updates
- myRTCpara for paratransit services (special accessibility, point-to-point)
- Club Ride Rewards to offer compensatory rewards for carpooling, etc
  
There may be others, and there are website analogs to some of these focus areas.

Consumer client software should consolidate most, if not all of the functionality found in these standalone applications into a single Progressive Web Application (PWA) for example, to enable access to all of these services and more by anyone using transit services, waiting to pick someone up at a transit stop, dropping someone off at a transit stop, visiting Las Vegas from abroad, or commuting daily.

Special Consumer applications may be appropriate in rare circumstances, but a unified approach to Transit Consumer experience is preferable for the Consumer and more easily maintained by the Developers.

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

- **Card**: As a Consumer, I need to know when my bus will arrive so that I can plan my arrival at the bus stop accordingly.
  - **Conversation**: Each Consumer of transit services has their own journey to make from their actual point of origin to the bus stop at which they will wait for the arrival of their bus.
  - **Confirmation**:
    - Consumer is able to determine estimated versus scheduled arrival time for any route at any stop, with statistical information presented in clear terms (% on time, etc)

---

- **Card**: As a Consumer, I need to know when any of my overall transit route is delayed, canceled, or unavailable to enable adjustment of my travel plan.
  - **Conversation**: A Consumer depending on multiple bus routes or hops, or hybrid travel eg bus + bike, bike + ride share + bus, etc, must be made aware as quickly as possible if any leg of the journey becomes unavailable so that the consumer may re-route their travel if possible.
  - **Confirmation**:
    - Consumer is presented with updated arrival estimates for each of pre-selected routes and stops to inform consumer of delays or cancellations in real time.
    - Consumer is offered alternate routes based on potential delays and cancellations with a known destination and potential waypoints.
  
---

- **Card**: As a Consumer, I would like to be able to provide feedback to the company regarding my transit experience at any particular time and place.
  - **Conversation**: A Consumer may encounter good or bad factors en route to their first stop, waiting, boarding, riding, exiting, waiting for another bus for continued travel, locating a bike share, waiting at an unfamiliar or distal stop, etc.
  - **Confirmation**:
    - Consumer is presented with a context-aware feedback interface, which varies based on whether approaching a stop, at a stop waiting, boarding/riding/exiting a vehicle, attempting to check out a bicycle, and so on, to provide positive or negative feedback, comments, photographic and potentially other information for the Company to process.
    - Consumer may need to select context for feedback, with accessible and localized interface for that selection. While automatic selection is intriguing, feedback about a bus stop after boarding a bus would become frustrating if the feedback context is auto-selected as Bus, for example, rather than But Stop.
    - Consumer is able to provide feedback and receive acknowledgment of receipt, as well as a method to continue engagement with follow-up, including resolution of any issues (or similar in the case of positive feedback)

---

- **Card**: As a Consumer, I need to use any or all transit services, but I do not speak English.
  - **Conversation**: While Census 2020 data indicates that English and Spanish are languages spoken more frequently in Southern Nevada, it is possible to construct the Consumer Client tools using modern internationalization (i18n) and localization (l10n) tools and methods to enable the Consumer Client to interact with the Consumer in their language, augmented with language-neutral visualizations.
  - **Confirmation**:
    - Consumer is able to interact with all tools via localized text and visual imagery (icons, etc), where all elements are designed to be WAI-ARIA accessible (assume Consumer does not speak English, does not speak Spanish, and cannot see).

---

- **Card**: As a Consumer, I would like to use one unified tool to interact with transit services on my mobile device and on my desktop computer(s).
  - **Conversation**: Each time an individual is required to install an application on their mobile device, there is a barrier to entry that can be substantial, not to mention the opportunities to confuse and confound. As well, a consumer may sometimes want or need to access transit services from a desktop or laptop computer, or generally access these services from a web browser.
  - **Confirmation**:
    - Consumer is able to access all services and retrieve all information regardless of platform, ie a mobile-friendly or mobile-first website usable from any device with a web browser is the first best option for accessibility across most if not all contexts.

---
