-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 06, 2017 at 06:23 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `woundcareapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `additional_medications`
--

CREATE TABLE `additional_medications` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `allergy_types`
--

CREATE TABLE `allergy_types` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `amount`
--

CREATE TABLE `amount` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `anesthesia`
--

CREATE TABLE `anesthesia` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `anticoagulants`
--

CREATE TABLE `anticoagulants` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `appearances`
--

CREATE TABLE `appearances` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `appetite_types`
--

CREATE TABLE `appetite_types` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `attached_documents`
--

CREATE TABLE `attached_documents` (
  `id` int(11) NOT NULL,
  `file_location` text COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `babinski_reflex`
--

CREATE TABLE `babinski_reflex` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `bed_type`
--

CREATE TABLE `bed_type` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `biopsy`
--

CREATE TABLE `biopsy` (
  `id` int(11) NOT NULL,
  `indication` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `disposition` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `biopsy_anesthesias`
--

CREATE TABLE `biopsy_anesthesias` (
  `biopsyId` int(11) NOT NULL,
  `anesthesia` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `biopsy_complications`
--

CREATE TABLE `biopsy_complications` (
  `biopsyId` int(11) NOT NULL,
  `complication` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `blister`
--

CREATE TABLE `blister` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cauterization_options`
--

CREATE TABLE `cauterization_options` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chair_type`
--

CREATE TABLE `chair_type` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `complications`
--

CREATE TABLE `complications` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `debridement`
--

CREATE TABLE `debridement` (
  `id` int(11) NOT NULL,
  `date_obtained` date DEFAULT NULL,
  `health_care_surrogate_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pre_debridement_depth` int(11) DEFAULT NULL,
  `pre_debridement_stage` int(11) DEFAULT NULL,
  `post_debridement_depth` int(11) DEFAULT NULL,
  `post_debridement_stage` int(11) DEFAULT NULL,
  `riskBenefits` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `surrogateName` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tissue` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `disposition` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cauterizationOption` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `debridement_anesthesias`
--

CREATE TABLE `debridement_anesthesias` (
  `debridement_id` int(11) NOT NULL,
  `anesthesia` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `debridement_complications`
--

CREATE TABLE `debridement_complications` (
  `debridement_id` int(11) NOT NULL,
  `complication` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `debridement_indications`
--

CREATE TABLE `debridement_indications` (
  `debridement_id` int(11) NOT NULL,
  `indication` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `debridement_instruments`
--

CREATE TABLE `debridement_instruments` (
  `debridement_id` int(11) NOT NULL,
  `instrument` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `debridement_tissue`
--

CREATE TABLE `debridement_tissue` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `discussed_with`
--

CREATE TABLE `discussed_with` (
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `disposition`
--

CREATE TABLE `disposition` (
  `name` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `dressings`
--

CREATE TABLE `dressings` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `edema`
--

CREATE TABLE `edema` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ethnicities`
--

CREATE TABLE `ethnicities` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `etiologies`
--

CREATE TABLE `etiologies` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `extremity_other_description`
--

CREATE TABLE `extremity_other_description` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `exudate`
--

CREATE TABLE `exudate` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `face_sheet`
--

CREATE TABLE `face_sheet` (
  `id` int(11) NOT NULL,
  `file_location` text COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `fall_risk_assessment`
--

CREATE TABLE `fall_risk_assessment` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `family_history`
--

CREATE TABLE `family_history` (
  `name` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `feet_type`
--

CREATE TABLE `feet_type` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `follow_up_ranges`
--

CREATE TABLE `follow_up_ranges` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `foot_temperature`
--

CREATE TABLE `foot_temperature` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `frequency`
--

CREATE TABLE `frequency` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `gastural_intestinal_types`
--

CREATE TABLE `gastural_intestinal_types` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `gender`
--

CREATE TABLE `gender` (
  `name` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `indications`
--

CREATE TABLE `indications` (
  `name` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `inflammatory`
--

CREATE TABLE `inflammatory` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `instruments`
--

CREATE TABLE `instruments` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `languages`
--

CREATE TABLE `languages` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `locations`
--

CREATE TABLE `locations` (
  `name` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `monofilament`
--

CREATE TABLE `monofilament` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `mood`
--

CREATE TABLE `mood` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `musculoskeletal`
--

CREATE TABLE `musculoskeletal` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `non_verbal_pain`
--

CREATE TABLE `non_verbal_pain` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `no_debridement_reasons`
--

CREATE TABLE `no_debridement_reasons` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orientations`
--

CREATE TABLE `orientations` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `other_wound_tissue`
--

CREATE TABLE `other_wound_tissue` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `past_medical_history`
--

CREATE TABLE `past_medical_history` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `id` int(11) NOT NULL,
  `firstName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `lastName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `appetite` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `isActive` bit(1) DEFAULT NULL,
  `isReferringPhysicianPrimaryPhysician` bit(1) DEFAULT NULL,
  `referringPhysicianId` int(11) DEFAULT NULL,
  `race` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ethnicity` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `socialHistory` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fallRiskAssessment` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pneumococcalVaccine` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `physicalExamId` int(11) DEFAULT NULL,
  `lastVisitDate` date DEFAULT NULL,
  `followUpVisitDate` date DEFAULT NULL,
  `roomNumber` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  `preferredLanguage` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `isDiabetic` bit(1) DEFAULT NULL,
  `isMedicationReviewed` bit(1) DEFAULT NULL,
  `isEmailPreferredContactMethod` bit(1) DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bed` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `isPatientReviewed` bit(1) DEFAULT NULL,
  `hasNonAdherence` bit(1) DEFAULT NULL,
  `isRiskBenefitExplained` bit(1) DEFAULT NULL,
  `totalFaceTimeInMinutes` int(11) DEFAULT NULL,
  `hasSignature` bit(1) DEFAULT NULL,
  `hasProviderAdheredToProtocol` bit(1) DEFAULT NULL,
  `followUpRange` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `isAdditionalPainMedicationNeeded` bit(1) DEFAULT NULL,
  `information` text COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_additional_medications`
--

CREATE TABLE `patient_additional_medications` (
  `patientId` int(11) NOT NULL,
  `medication` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_allergies`
--

CREATE TABLE `patient_allergies` (
  `patientId` int(11) NOT NULL,
  `allergy` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_anticoagulants`
--

CREATE TABLE `patient_anticoagulants` (
  `patientId` int(11) NOT NULL,
  `anticoagulant` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_attached_documents`
--

CREATE TABLE `patient_attached_documents` (
  `patientId` int(11) NOT NULL,
  `attached_document_id` int(11) NOT NULL,
  `file_location` text COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_chairs`
--

CREATE TABLE `patient_chairs` (
  `patientId` int(11) NOT NULL,
  `chair` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_discussed_with`
--

CREATE TABLE `patient_discussed_with` (
  `patientId` int(11) NOT NULL,
  `discussedWith` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_face_sheet`
--

CREATE TABLE `patient_face_sheet` (
  `patientId` int(11) NOT NULL,
  `face_sheet_id` int(11) NOT NULL,
  `file_location` text COLLATE utf8_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_family_history`
--

CREATE TABLE `patient_family_history` (
  `patientId` int(11) NOT NULL,
  `familyHistory` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_feet_type`
--

CREATE TABLE `patient_feet_type` (
  `patientId` int(11) NOT NULL,
  `feetType` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_gastural_intestinals`
--

CREATE TABLE `patient_gastural_intestinals` (
  `patientId` int(11) NOT NULL,
  `gastural_intestinal` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_musculoskeletal`
--

CREATE TABLE `patient_musculoskeletal` (
  `patientId` int(11) NOT NULL,
  `musculoskeletal` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_past_medical_history`
--

CREATE TABLE `patient_past_medical_history` (
  `patientId` int(11) NOT NULL,
  `past_medical_history` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_supplementation_orders`
--

CREATE TABLE `patient_supplementation_orders` (
  `patientId` int(11) NOT NULL,
  `supplement` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patient_supplements`
--

CREATE TABLE `patient_supplements` (
  `patientId` int(11) NOT NULL,
  `supplement` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pedal_pulse_description`
--

CREATE TABLE `pedal_pulse_description` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `periwound`
--

CREATE TABLE `periwound` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam`
--

CREATE TABLE `physical_exam` (
  `id` int(11) NOT NULL,
  `verbalPain` int(11) DEFAULT NULL,
  `nonVerbalPain` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bloodPressureTop` int(11) DEFAULT NULL,
  `bloodPressureBottom` int(11) DEFAULT NULL,
  `heightInFeet` int(11) DEFAULT NULL,
  `heightInInches` int(11) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  `capRefill` int(11) DEFAULT NULL,
  `pedalPulseRightDorsalirPedis` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pedalPulseRightPosteriorTibial` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pedalPulseLeftDorsalirPedis` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pedalPulseLeftPosteriorTibial` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `leftMonofilament` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rightMonofilament` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `leftBabinskiReflex` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rightBabinskiReflex` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `leftLowerExtremityEdema` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `leftLowerExtremityOther` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `leftLowerExtremityInflammatory` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `leftLowerExtremityFootTemperature` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rightLowerExtremityEdema` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rightLowerExtremityOther` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rightLowerExtremityInflammatory` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rightLowerExtremityFootTemperature` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `investigation` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_abdomen_descriptions`
--

CREATE TABLE `physical_exam_abdomen_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_appearances`
--

CREATE TABLE `physical_exam_appearances` (
  `physicalExamId` int(11) NOT NULL,
  `appearance` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_axilary_nodes_descriptions`
--

CREATE TABLE `physical_exam_axilary_nodes_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_back_descriptions`
--

CREATE TABLE `physical_exam_back_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_chest_descriptions`
--

CREATE TABLE `physical_exam_chest_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_description`
--

CREATE TABLE `physical_exam_description` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_digits_descriptions`
--

CREATE TABLE `physical_exam_digits_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_groin_descriptions`
--

CREATE TABLE `physical_exam_groin_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_head_descriptions`
--

CREATE TABLE `physical_exam_head_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_inguinal_nodes_descriptions`
--

CREATE TABLE `physical_exam_inguinal_nodes_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_investigation`
--

CREATE TABLE `physical_exam_investigation` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_lower_left_extremity_descriptions`
--

CREATE TABLE `physical_exam_lower_left_extremity_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_lower_right_extremity_descriptions`
--

CREATE TABLE `physical_exam_lower_right_extremity_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_mood`
--

CREATE TABLE `physical_exam_mood` (
  `physicalExamId` int(11) NOT NULL,
  `mood` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_neck_descriptions`
--

CREATE TABLE `physical_exam_neck_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_orientation`
--

CREATE TABLE `physical_exam_orientation` (
  `physicalExamId` int(11) NOT NULL,
  `orientation` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_scalp_descriptions`
--

CREATE TABLE `physical_exam_scalp_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_upper_left_extremitiy_descriptions`
--

CREATE TABLE `physical_exam_upper_left_extremitiy_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `physical_exam_upper_right_extremitiy_descriptions`
--

CREATE TABLE `physical_exam_upper_right_extremitiy_descriptions` (
  `physicalExamId` int(11) NOT NULL,
  `physicalExamDescription` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pneumococcal_vaccine`
--

CREATE TABLE `pneumococcal_vaccine` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pressure_stage`
--

CREATE TABLE `pressure_stage` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `races`
--

CREATE TABLE `races` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `recommendations`
--

CREATE TABLE `recommendations` (
  `name` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `referring_physicians`
--

CREATE TABLE `referring_physicians` (
  `id` int(11) NOT NULL,
  `firstName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `lastName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `risk_benefits`
--

CREATE TABLE `risk_benefits` (
  `name` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `smoking_history`
--

CREATE TABLE `smoking_history` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `social_history`
--

CREATE TABLE `social_history` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `source_of_history`
--

CREATE TABLE `source_of_history` (
  `name` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `supplments`
--

CREATE TABLE `supplments` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `results` float(4,2) DEFAULT NULL,
  `testType` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dateReviewed` date DEFAULT NULL,
  `progress` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `test_progress`
--

CREATE TABLE `test_progress` (
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wounds`
--

CREATE TABLE `wounds` (
  `id` int(11) NOT NULL,
  `hasScab` bit(1) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `stage` int(11) DEFAULT NULL,
  `hasDebridement` bit(1) DEFAULT NULL,
  `hasBiopsy` bit(1) DEFAULT NULL,
  `hasCauterization` bit(1) DEFAULT NULL,
  `blister` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `frequency` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `amount` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `biopsyId` int(11) DEFAULT NULL,
  `etiology` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sizeDepth` int(11) DEFAULT NULL,
  `sizeLength` int(11) DEFAULT NULL,
  `sizeWidth` int(11) DEFAULT NULL,
  `exudate` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `underminingSize` int(11) DEFAULT NULL,
  `underminingLocation` int(11) DEFAULT NULL,
  `skinPercentage` int(11) DEFAULT NULL,
  `escahrPercentage` int(11) DEFAULT NULL,
  `granulationPercentage` int(11) DEFAULT NULL,
  `necroticPercentage` int(11) DEFAULT NULL,
  `otherTissueDammage` int(11) DEFAULT NULL,
  `debridementId` int(11) DEFAULT NULL,
  `otherWoundTissueName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sourceOfHistory` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `woundProgress` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wounds_no_debridement_reasons`
--

CREATE TABLE `wounds_no_debridement_reasons` (
  `woundId` int(11) NOT NULL,
  `noDebridementReason` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_blister`
--

CREATE TABLE `wound_blister` (
  `wound_id` int(11) NOT NULL,
  `blister_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_description`
--

CREATE TABLE `wound_description` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_descriptions`
--

CREATE TABLE `wound_descriptions` (
  `wound_id` int(11) NOT NULL,
  `wound_description` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_dressings_to_continue`
--

CREATE TABLE `wound_dressings_to_continue` (
  `wound_id` int(11) NOT NULL,
  `dressings_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_dressings_to_discontinue`
--

CREATE TABLE `wound_dressings_to_discontinue` (
  `wound_id` int(11) NOT NULL,
  `dressings_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_dressings_to_start`
--

CREATE TABLE `wound_dressings_to_start` (
  `wound_id` int(11) NOT NULL,
  `dressings_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_locations`
--

CREATE TABLE `wound_locations` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_objective`
--

CREATE TABLE `wound_objective` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_objectives`
--

CREATE TABLE `wound_objectives` (
  `wound_id` int(11) NOT NULL,
  `wound_objective_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_periwound`
--

CREATE TABLE `wound_periwound` (
  `wound_id` int(11) NOT NULL,
  `periwound_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_progress`
--

CREATE TABLE `wound_progress` (
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wound_recommendations`
--

CREATE TABLE `wound_recommendations` (
  `wound_id` int(11) NOT NULL,
  `recommendations_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `additional_medications`
--
ALTER TABLE `additional_medications`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `allergy_types`
--
ALTER TABLE `allergy_types`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `amount`
--
ALTER TABLE `amount`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `anesthesia`
--
ALTER TABLE `anesthesia`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `anticoagulants`
--
ALTER TABLE `anticoagulants`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `appearances`
--
ALTER TABLE `appearances`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `appetite_types`
--
ALTER TABLE `appetite_types`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `attached_documents`
--
ALTER TABLE `attached_documents`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `babinski_reflex`
--
ALTER TABLE `babinski_reflex`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `bed_type`
--
ALTER TABLE `bed_type`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `biopsy`
--
ALTER TABLE `biopsy`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_indication_biopsy` (`indication`),
  ADD KEY `fk_disposition_biopsy` (`disposition`);

--
-- Indexes for table `biopsy_anesthesias`
--
ALTER TABLE `biopsy_anesthesias`
  ADD PRIMARY KEY (`biopsyId`,`anesthesia`),
  ADD KEY `FK_anesthesia_biopsy` (`anesthesia`);

--
-- Indexes for table `biopsy_complications`
--
ALTER TABLE `biopsy_complications`
  ADD PRIMARY KEY (`biopsyId`,`complication`),
  ADD KEY `FK_complication_biopsy` (`complication`);

--
-- Indexes for table `blister`
--
ALTER TABLE `blister`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `cauterization_options`
--
ALTER TABLE `cauterization_options`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `chair_type`
--
ALTER TABLE `chair_type`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `complications`
--
ALTER TABLE `complications`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `debridement`
--
ALTER TABLE `debridement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_risk_benefits` (`riskBenefits`),
  ADD KEY `fk_debridement_tissue` (`tissue`),
  ADD KEY `fk_cauterization_option` (`cauterizationOption`),
  ADD KEY `fk_disposition` (`disposition`);

--
-- Indexes for table `debridement_anesthesias`
--
ALTER TABLE `debridement_anesthesias`
  ADD PRIMARY KEY (`debridement_id`,`anesthesia`),
  ADD KEY `FK_anesthesia` (`anesthesia`);

--
-- Indexes for table `debridement_complications`
--
ALTER TABLE `debridement_complications`
  ADD PRIMARY KEY (`debridement_id`,`complication`),
  ADD KEY `FK_complications` (`complication`);

--
-- Indexes for table `debridement_indications`
--
ALTER TABLE `debridement_indications`
  ADD PRIMARY KEY (`debridement_id`,`indication`),
  ADD KEY `FK_indications` (`indication`);

--
-- Indexes for table `debridement_instruments`
--
ALTER TABLE `debridement_instruments`
  ADD PRIMARY KEY (`debridement_id`,`instrument`),
  ADD KEY `FK_instruments` (`instrument`);

--
-- Indexes for table `debridement_tissue`
--
ALTER TABLE `debridement_tissue`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `discussed_with`
--
ALTER TABLE `discussed_with`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `disposition`
--
ALTER TABLE `disposition`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `dressings`
--
ALTER TABLE `dressings`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `edema`
--
ALTER TABLE `edema`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `ethnicities`
--
ALTER TABLE `ethnicities`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `etiologies`
--
ALTER TABLE `etiologies`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `extremity_other_description`
--
ALTER TABLE `extremity_other_description`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `exudate`
--
ALTER TABLE `exudate`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `face_sheet`
--
ALTER TABLE `face_sheet`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fall_risk_assessment`
--
ALTER TABLE `fall_risk_assessment`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `family_history`
--
ALTER TABLE `family_history`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `feet_type`
--
ALTER TABLE `feet_type`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `follow_up_ranges`
--
ALTER TABLE `follow_up_ranges`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `foot_temperature`
--
ALTER TABLE `foot_temperature`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `frequency`
--
ALTER TABLE `frequency`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `gastural_intestinal_types`
--
ALTER TABLE `gastural_intestinal_types`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `gender`
--
ALTER TABLE `gender`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `indications`
--
ALTER TABLE `indications`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `inflammatory`
--
ALTER TABLE `inflammatory`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `instruments`
--
ALTER TABLE `instruments`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `languages`
--
ALTER TABLE `languages`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `locations`
--
ALTER TABLE `locations`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `monofilament`
--
ALTER TABLE `monofilament`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `mood`
--
ALTER TABLE `mood`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `musculoskeletal`
--
ALTER TABLE `musculoskeletal`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `non_verbal_pain`
--
ALTER TABLE `non_verbal_pain`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `no_debridement_reasons`
--
ALTER TABLE `no_debridement_reasons`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `orientations`
--
ALTER TABLE `orientations`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `other_wound_tissue`
--
ALTER TABLE `other_wound_tissue`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `past_medical_history`
--
ALTER TABLE `past_medical_history`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_appetite` (`appetite`),
  ADD KEY `fk_referring_physician` (`referringPhysicianId`),
  ADD KEY `fk_race` (`race`),
  ADD KEY `fk_ethnicity` (`ethnicity`),
  ADD KEY `fk_locations` (`location`),
  ADD KEY `fk_social_history` (`socialHistory`),
  ADD KEY `fk_fall_risk_assessment` (`fallRiskAssessment`),
  ADD KEY `fk_pneumococcal_vaccine` (`pneumococcalVaccine`),
  ADD KEY `fk_patient_physical_exam` (`physicalExamId`),
  ADD KEY `fk_gender` (`gender`),
  ADD KEY `fk_preferred_language` (`preferredLanguage`),
  ADD KEY `fk_bed_type` (`bed`),
  ADD KEY `fk_follow_up_ranges` (`followUpRange`);

--
-- Indexes for table `patient_additional_medications`
--
ALTER TABLE `patient_additional_medications`
  ADD PRIMARY KEY (`patientId`,`medication`),
  ADD KEY `FK_medication` (`medication`);

--
-- Indexes for table `patient_allergies`
--
ALTER TABLE `patient_allergies`
  ADD PRIMARY KEY (`patientId`,`allergy`),
  ADD KEY `FK_allergy` (`allergy`);

--
-- Indexes for table `patient_anticoagulants`
--
ALTER TABLE `patient_anticoagulants`
  ADD PRIMARY KEY (`patientId`,`anticoagulant`),
  ADD KEY `FK_anticoagulants` (`anticoagulant`);

--
-- Indexes for table `patient_attached_documents`
--
ALTER TABLE `patient_attached_documents`
  ADD PRIMARY KEY (`patientId`,`attached_document_id`),
  ADD KEY `FK_attached_documents` (`attached_document_id`);

--
-- Indexes for table `patient_chairs`
--
ALTER TABLE `patient_chairs`
  ADD PRIMARY KEY (`patientId`,`chair`),
  ADD KEY `FK_chair` (`chair`);

--
-- Indexes for table `patient_discussed_with`
--
ALTER TABLE `patient_discussed_with`
  ADD PRIMARY KEY (`patientId`,`discussedWith`),
  ADD KEY `FK_discussed_with` (`discussedWith`);

--
-- Indexes for table `patient_face_sheet`
--
ALTER TABLE `patient_face_sheet`
  ADD PRIMARY KEY (`patientId`,`face_sheet_id`),
  ADD KEY `FK_attached_face_sheet` (`face_sheet_id`);

--
-- Indexes for table `patient_family_history`
--
ALTER TABLE `patient_family_history`
  ADD PRIMARY KEY (`patientId`,`familyHistory`),
  ADD KEY `FK_family_history` (`familyHistory`);

--
-- Indexes for table `patient_feet_type`
--
ALTER TABLE `patient_feet_type`
  ADD PRIMARY KEY (`patientId`,`feetType`),
  ADD KEY `FK_feet_type` (`feetType`);

--
-- Indexes for table `patient_gastural_intestinals`
--
ALTER TABLE `patient_gastural_intestinals`
  ADD PRIMARY KEY (`patientId`,`gastural_intestinal`),
  ADD KEY `FK_gi` (`gastural_intestinal`);

--
-- Indexes for table `patient_musculoskeletal`
--
ALTER TABLE `patient_musculoskeletal`
  ADD PRIMARY KEY (`patientId`,`musculoskeletal`),
  ADD KEY `FK_musculoskeletal` (`musculoskeletal`);

--
-- Indexes for table `patient_past_medical_history`
--
ALTER TABLE `patient_past_medical_history`
  ADD PRIMARY KEY (`patientId`,`past_medical_history`),
  ADD KEY `FK_past_medical_history` (`past_medical_history`);

--
-- Indexes for table `patient_supplementation_orders`
--
ALTER TABLE `patient_supplementation_orders`
  ADD PRIMARY KEY (`patientId`,`supplement`),
  ADD KEY `FK_supplements_ordered` (`supplement`);

--
-- Indexes for table `patient_supplements`
--
ALTER TABLE `patient_supplements`
  ADD PRIMARY KEY (`patientId`,`supplement`),
  ADD KEY `FK_supplements` (`supplement`);

--
-- Indexes for table `pedal_pulse_description`
--
ALTER TABLE `pedal_pulse_description`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `periwound`
--
ALTER TABLE `periwound`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `physical_exam`
--
ALTER TABLE `physical_exam`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_non_verbal_pain` (`nonVerbalPain`),
  ADD KEY `fk_pedal_pulse_right_dorsalir_pedis` (`pedalPulseRightDorsalirPedis`),
  ADD KEY `fk_pedal_pulse_right_posterior_tibial` (`pedalPulseRightPosteriorTibial`),
  ADD KEY `fk_pedal_pulse_left_dorsalir_pedis` (`pedalPulseLeftDorsalirPedis`),
  ADD KEY `fk_pedal_pulse_left_posterior_tibial` (`pedalPulseLeftPosteriorTibial`),
  ADD KEY `fk_left_monofilament` (`leftMonofilament`),
  ADD KEY `fk_right_monofilament` (`rightMonofilament`),
  ADD KEY `fk_left_babinski_reflex` (`leftBabinskiReflex`),
  ADD KEY `fk_right_babinski_reflex` (`rightBabinskiReflex`),
  ADD KEY `fk_left_lower_extremity_edema` (`leftLowerExtremityEdema`),
  ADD KEY `fk_right_lower_extremity_edema` (`rightLowerExtremityEdema`),
  ADD KEY `fk_left_lower_extremity_other` (`leftLowerExtremityOther`),
  ADD KEY `fk_right_lower_extremity_other` (`rightLowerExtremityOther`),
  ADD KEY `fk_left_lower_extremity_inflammatory` (`leftLowerExtremityInflammatory`),
  ADD KEY `fk_right_lower_extremity_inflammatory` (`rightLowerExtremityInflammatory`),
  ADD KEY `fk_left_lower_extremity_foot_temperature` (`leftLowerExtremityFootTemperature`),
  ADD KEY `fk_right_lower_extremity_foot_temperature` (`rightLowerExtremityFootTemperature`),
  ADD KEY `fk_physical_exam_investigation` (`investigation`);

--
-- Indexes for table `physical_exam_abdomen_descriptions`
--
ALTER TABLE `physical_exam_abdomen_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_abdomen` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_appearances`
--
ALTER TABLE `physical_exam_appearances`
  ADD PRIMARY KEY (`physicalExamId`,`appearance`),
  ADD KEY `FK_appearance` (`appearance`);

--
-- Indexes for table `physical_exam_axilary_nodes_descriptions`
--
ALTER TABLE `physical_exam_axilary_nodes_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_axilary_nodes` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_back_descriptions`
--
ALTER TABLE `physical_exam_back_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_back` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_chest_descriptions`
--
ALTER TABLE `physical_exam_chest_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_chest` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_description`
--
ALTER TABLE `physical_exam_description`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `physical_exam_digits_descriptions`
--
ALTER TABLE `physical_exam_digits_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_digits` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_groin_descriptions`
--
ALTER TABLE `physical_exam_groin_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_groin` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_head_descriptions`
--
ALTER TABLE `physical_exam_head_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_head` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_inguinal_nodes_descriptions`
--
ALTER TABLE `physical_exam_inguinal_nodes_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_inguinal_nodes` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_investigation`
--
ALTER TABLE `physical_exam_investigation`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `physical_exam_lower_left_extremity_descriptions`
--
ALTER TABLE `physical_exam_lower_left_extremity_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_lower_left_extremity` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_lower_right_extremity_descriptions`
--
ALTER TABLE `physical_exam_lower_right_extremity_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_lower_right_extremity` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_mood`
--
ALTER TABLE `physical_exam_mood`
  ADD PRIMARY KEY (`physicalExamId`,`mood`),
  ADD KEY `FK_mood` (`mood`);

--
-- Indexes for table `physical_exam_neck_descriptions`
--
ALTER TABLE `physical_exam_neck_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_neck` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_orientation`
--
ALTER TABLE `physical_exam_orientation`
  ADD PRIMARY KEY (`physicalExamId`,`orientation`),
  ADD KEY `FK_orientation` (`orientation`);

--
-- Indexes for table `physical_exam_scalp_descriptions`
--
ALTER TABLE `physical_exam_scalp_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_scalp` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_upper_left_extremitiy_descriptions`
--
ALTER TABLE `physical_exam_upper_left_extremitiy_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_upper_left_extremitiy` (`physicalExamDescription`);

--
-- Indexes for table `physical_exam_upper_right_extremitiy_descriptions`
--
ALTER TABLE `physical_exam_upper_right_extremitiy_descriptions`
  ADD PRIMARY KEY (`physicalExamId`,`physicalExamDescription`),
  ADD KEY `FK_upper_right_extremitiy` (`physicalExamDescription`);

--
-- Indexes for table `pneumococcal_vaccine`
--
ALTER TABLE `pneumococcal_vaccine`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `pressure_stage`
--
ALTER TABLE `pressure_stage`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `races`
--
ALTER TABLE `races`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `recommendations`
--
ALTER TABLE `recommendations`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `referring_physicians`
--
ALTER TABLE `referring_physicians`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `risk_benefits`
--
ALTER TABLE `risk_benefits`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `smoking_history`
--
ALTER TABLE `smoking_history`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `social_history`
--
ALTER TABLE `social_history`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `source_of_history`
--
ALTER TABLE `source_of_history`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `supplments`
--
ALTER TABLE `supplments`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_test_progress` (`progress`);

--
-- Indexes for table `test_progress`
--
ALTER TABLE `test_progress`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `wounds`
--
ALTER TABLE `wounds`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_amount` (`amount`),
  ADD KEY `FK_frequency` (`frequency`),
  ADD KEY `FK_blister` (`blister`),
  ADD KEY `fk_biopsy_wounds` (`biopsyId`),
  ADD KEY `fk_etiology` (`etiology`),
  ADD KEY `fk_wound_location` (`location`),
  ADD KEY `fk_exudate_wound` (`exudate`),
  ADD KEY `fk_debridement_wounds` (`debridementId`),
  ADD KEY `fk_other_wound_tissue` (`otherWoundTissueName`),
  ADD KEY `fk_source_of_history` (`sourceOfHistory`),
  ADD KEY `fk_wound_progress` (`woundProgress`);

--
-- Indexes for table `wounds_no_debridement_reasons`
--
ALTER TABLE `wounds_no_debridement_reasons`
  ADD PRIMARY KEY (`woundId`,`noDebridementReason`),
  ADD KEY `FK_no_debridement_reasons` (`noDebridementReason`);

--
-- Indexes for table `wound_blister`
--
ALTER TABLE `wound_blister`
  ADD PRIMARY KEY (`wound_id`,`blister_id`),
  ADD KEY `FK_blisters` (`blister_id`);

--
-- Indexes for table `wound_description`
--
ALTER TABLE `wound_description`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `wound_descriptions`
--
ALTER TABLE `wound_descriptions`
  ADD PRIMARY KEY (`wound_id`,`wound_description`),
  ADD KEY `FK_description` (`wound_description`);

--
-- Indexes for table `wound_dressings_to_continue`
--
ALTER TABLE `wound_dressings_to_continue`
  ADD PRIMARY KEY (`wound_id`,`dressings_id`),
  ADD KEY `FK_dressings_continue` (`dressings_id`);

--
-- Indexes for table `wound_dressings_to_discontinue`
--
ALTER TABLE `wound_dressings_to_discontinue`
  ADD PRIMARY KEY (`wound_id`,`dressings_id`),
  ADD KEY `FK_dressings_discontinue` (`dressings_id`);

--
-- Indexes for table `wound_dressings_to_start`
--
ALTER TABLE `wound_dressings_to_start`
  ADD PRIMARY KEY (`wound_id`,`dressings_id`),
  ADD KEY `FK_dressings_start` (`dressings_id`);

--
-- Indexes for table `wound_locations`
--
ALTER TABLE `wound_locations`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `wound_objective`
--
ALTER TABLE `wound_objective`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `wound_objectives`
--
ALTER TABLE `wound_objectives`
  ADD PRIMARY KEY (`wound_id`,`wound_objective_id`),
  ADD KEY `FK_wound_objective` (`wound_objective_id`);

--
-- Indexes for table `wound_periwound`
--
ALTER TABLE `wound_periwound`
  ADD PRIMARY KEY (`wound_id`,`periwound_id`),
  ADD KEY `FK_periwound` (`periwound_id`);

--
-- Indexes for table `wound_progress`
--
ALTER TABLE `wound_progress`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `wound_recommendations`
--
ALTER TABLE `wound_recommendations`
  ADD PRIMARY KEY (`wound_id`,`recommendations_id`),
  ADD KEY `FK_recommendations` (`recommendations_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `biopsy`
--
ALTER TABLE `biopsy`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `debridement`
--
ALTER TABLE `debridement`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `physical_exam`
--
ALTER TABLE `physical_exam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `test`
--
ALTER TABLE `test`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `wounds`
--
ALTER TABLE `wounds`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `biopsy`
--
ALTER TABLE `biopsy`
  ADD CONSTRAINT `fk_disposition_biopsy` FOREIGN KEY (`disposition`) REFERENCES `disposition` (`name`),
  ADD CONSTRAINT `fk_indication_biopsy` FOREIGN KEY (`indication`) REFERENCES `indications` (`name`);

--
-- Constraints for table `biopsy_anesthesias`
--
ALTER TABLE `biopsy_anesthesias`
  ADD CONSTRAINT `FK_anesthesia_biopsy` FOREIGN KEY (`anesthesia`) REFERENCES `anesthesia` (`name`),
  ADD CONSTRAINT `FK_biopsy_anesthesias` FOREIGN KEY (`biopsyId`) REFERENCES `biopsy` (`id`);

--
-- Constraints for table `biopsy_complications`
--
ALTER TABLE `biopsy_complications`
  ADD CONSTRAINT `FK_biopsy_complications` FOREIGN KEY (`biopsyId`) REFERENCES `biopsy` (`id`),
  ADD CONSTRAINT `FK_complication_biopsy` FOREIGN KEY (`complication`) REFERENCES `complications` (`name`);

--
-- Constraints for table `debridement`
--
ALTER TABLE `debridement`
  ADD CONSTRAINT `fk_cauterization_option` FOREIGN KEY (`cauterizationOption`) REFERENCES `cauterization_options` (`name`),
  ADD CONSTRAINT `fk_debridement_tissue` FOREIGN KEY (`tissue`) REFERENCES `debridement_tissue` (`name`),
  ADD CONSTRAINT `fk_disposition` FOREIGN KEY (`disposition`) REFERENCES `disposition` (`name`),
  ADD CONSTRAINT `fk_risk_benefits` FOREIGN KEY (`riskBenefits`) REFERENCES `risk_benefits` (`name`);

--
-- Constraints for table `debridement_anesthesias`
--
ALTER TABLE `debridement_anesthesias`
  ADD CONSTRAINT `FK_anesthesia` FOREIGN KEY (`anesthesia`) REFERENCES `anesthesia` (`name`),
  ADD CONSTRAINT `FK_debridement_anesthesia` FOREIGN KEY (`debridement_id`) REFERENCES `debridement` (`id`);

--
-- Constraints for table `debridement_complications`
--
ALTER TABLE `debridement_complications`
  ADD CONSTRAINT `FK_complications` FOREIGN KEY (`complication`) REFERENCES `complications` (`name`),
  ADD CONSTRAINT `FK_debridement_complications` FOREIGN KEY (`debridement_id`) REFERENCES `debridement` (`id`);

--
-- Constraints for table `debridement_indications`
--
ALTER TABLE `debridement_indications`
  ADD CONSTRAINT `FK_debridement_indications` FOREIGN KEY (`debridement_id`) REFERENCES `debridement` (`id`),
  ADD CONSTRAINT `FK_indications` FOREIGN KEY (`indication`) REFERENCES `indications` (`name`);

--
-- Constraints for table `debridement_instruments`
--
ALTER TABLE `debridement_instruments`
  ADD CONSTRAINT `FK_debridement_instruments` FOREIGN KEY (`debridement_id`) REFERENCES `debridement` (`id`),
  ADD CONSTRAINT `FK_instruments` FOREIGN KEY (`instrument`) REFERENCES `instruments` (`name`);

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `fk_appetite` FOREIGN KEY (`appetite`) REFERENCES `appetite_types` (`name`),
  ADD CONSTRAINT `fk_bed_type` FOREIGN KEY (`bed`) REFERENCES `bed_type` (`name`),
  ADD CONSTRAINT `fk_ethnicity` FOREIGN KEY (`ethnicity`) REFERENCES `ethnicities` (`name`),
  ADD CONSTRAINT `fk_fall_risk_assessment` FOREIGN KEY (`fallRiskAssessment`) REFERENCES `fall_risk_assessment` (`name`),
  ADD CONSTRAINT `fk_follow_up_ranges` FOREIGN KEY (`followUpRange`) REFERENCES `follow_up_ranges` (`name`),
  ADD CONSTRAINT `fk_gender` FOREIGN KEY (`gender`) REFERENCES `gender` (`name`),
  ADD CONSTRAINT `fk_locations` FOREIGN KEY (`location`) REFERENCES `locations` (`name`),
  ADD CONSTRAINT `fk_patient_physical_exam` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`),
  ADD CONSTRAINT `fk_pneumococcal_vaccine` FOREIGN KEY (`pneumococcalVaccine`) REFERENCES `pneumococcal_vaccine` (`name`),
  ADD CONSTRAINT `fk_preferred_language` FOREIGN KEY (`preferredLanguage`) REFERENCES `languages` (`name`),
  ADD CONSTRAINT `fk_race` FOREIGN KEY (`race`) REFERENCES `races` (`name`),
  ADD CONSTRAINT `fk_referring_physician` FOREIGN KEY (`referringPhysicianId`) REFERENCES `referring_physicians` (`id`),
  ADD CONSTRAINT `fk_social_history` FOREIGN KEY (`socialHistory`) REFERENCES `social_history` (`name`);

--
-- Constraints for table `patient_additional_medications`
--
ALTER TABLE `patient_additional_medications`
  ADD CONSTRAINT `FK_medication` FOREIGN KEY (`medication`) REFERENCES `additional_medications` (`name`),
  ADD CONSTRAINT `FK_patient_additional_medications` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_allergies`
--
ALTER TABLE `patient_allergies`
  ADD CONSTRAINT `FK_allergy` FOREIGN KEY (`allergy`) REFERENCES `allergy_types` (`name`),
  ADD CONSTRAINT `FK_patient` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_anticoagulants`
--
ALTER TABLE `patient_anticoagulants`
  ADD CONSTRAINT `FK_anticoagulants` FOREIGN KEY (`anticoagulant`) REFERENCES `anticoagulants` (`name`),
  ADD CONSTRAINT `FK_patient_anticoagulants` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_attached_documents`
--
ALTER TABLE `patient_attached_documents`
  ADD CONSTRAINT `FK_attached_documents` FOREIGN KEY (`attached_document_id`) REFERENCES `attached_documents` (`id`),
  ADD CONSTRAINT `FK_patient_attached_documents` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_chairs`
--
ALTER TABLE `patient_chairs`
  ADD CONSTRAINT `FK_chair` FOREIGN KEY (`chair`) REFERENCES `chair_type` (`name`),
  ADD CONSTRAINT `FK_patient_chairs` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_discussed_with`
--
ALTER TABLE `patient_discussed_with`
  ADD CONSTRAINT `FK_discussed_with` FOREIGN KEY (`discussedWith`) REFERENCES `discussed_with` (`name`),
  ADD CONSTRAINT `FK_patient_discussed_with` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_face_sheet`
--
ALTER TABLE `patient_face_sheet`
  ADD CONSTRAINT `FK_attached_face_sheet` FOREIGN KEY (`face_sheet_id`) REFERENCES `face_sheet` (`id`),
  ADD CONSTRAINT `FK_patient_face_sheet` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_family_history`
--
ALTER TABLE `patient_family_history`
  ADD CONSTRAINT `FK_family_history` FOREIGN KEY (`familyHistory`) REFERENCES `family_history` (`name`),
  ADD CONSTRAINT `FK_patient_family_history` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_feet_type`
--
ALTER TABLE `patient_feet_type`
  ADD CONSTRAINT `FK_feet_type` FOREIGN KEY (`feetType`) REFERENCES `feet_type` (`name`),
  ADD CONSTRAINT `FK_patient_feet_type` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_gastural_intestinals`
--
ALTER TABLE `patient_gastural_intestinals`
  ADD CONSTRAINT `FK_gi` FOREIGN KEY (`gastural_intestinal`) REFERENCES `gastural_intestinal_types` (`name`),
  ADD CONSTRAINT `FK_patient_gi` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_musculoskeletal`
--
ALTER TABLE `patient_musculoskeletal`
  ADD CONSTRAINT `FK_musculoskeletal` FOREIGN KEY (`musculoskeletal`) REFERENCES `musculoskeletal` (`name`),
  ADD CONSTRAINT `FK_patient_musculoskeletal` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_past_medical_history`
--
ALTER TABLE `patient_past_medical_history`
  ADD CONSTRAINT `FK_past_medical_history` FOREIGN KEY (`past_medical_history`) REFERENCES `past_medical_history` (`name`),
  ADD CONSTRAINT `FK_patient_past_medical_history` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`);

--
-- Constraints for table `patient_supplementation_orders`
--
ALTER TABLE `patient_supplementation_orders`
  ADD CONSTRAINT `FK_patient_supplementation_orders` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`),
  ADD CONSTRAINT `FK_supplements_ordered` FOREIGN KEY (`supplement`) REFERENCES `supplments` (`name`);

--
-- Constraints for table `patient_supplements`
--
ALTER TABLE `patient_supplements`
  ADD CONSTRAINT `FK_patient_supplements` FOREIGN KEY (`patientId`) REFERENCES `patient` (`id`),
  ADD CONSTRAINT `FK_supplements` FOREIGN KEY (`supplement`) REFERENCES `supplments` (`name`);

--
-- Constraints for table `physical_exam`
--
ALTER TABLE `physical_exam`
  ADD CONSTRAINT `fk_left_babinski_reflex` FOREIGN KEY (`leftBabinskiReflex`) REFERENCES `babinski_reflex` (`name`),
  ADD CONSTRAINT `fk_left_lower_extremity_edema` FOREIGN KEY (`leftLowerExtremityEdema`) REFERENCES `edema` (`name`),
  ADD CONSTRAINT `fk_left_lower_extremity_foot_temperature` FOREIGN KEY (`leftLowerExtremityFootTemperature`) REFERENCES `foot_temperature` (`name`),
  ADD CONSTRAINT `fk_left_lower_extremity_inflammatory` FOREIGN KEY (`leftLowerExtremityInflammatory`) REFERENCES `inflammatory` (`name`),
  ADD CONSTRAINT `fk_left_lower_extremity_other` FOREIGN KEY (`leftLowerExtremityOther`) REFERENCES `extremity_other_description` (`name`),
  ADD CONSTRAINT `fk_left_monofilament` FOREIGN KEY (`leftMonofilament`) REFERENCES `monofilament` (`name`),
  ADD CONSTRAINT `fk_non_verbal_pain` FOREIGN KEY (`nonVerbalPain`) REFERENCES `non_verbal_pain` (`name`),
  ADD CONSTRAINT `fk_pedal_pulse_left_dorsalir_pedis` FOREIGN KEY (`pedalPulseLeftDorsalirPedis`) REFERENCES `pedal_pulse_description` (`name`),
  ADD CONSTRAINT `fk_pedal_pulse_left_posterior_tibial` FOREIGN KEY (`pedalPulseLeftPosteriorTibial`) REFERENCES `pedal_pulse_description` (`name`),
  ADD CONSTRAINT `fk_pedal_pulse_right_dorsalir_pedis` FOREIGN KEY (`pedalPulseRightDorsalirPedis`) REFERENCES `pedal_pulse_description` (`name`),
  ADD CONSTRAINT `fk_pedal_pulse_right_posterior_tibial` FOREIGN KEY (`pedalPulseRightPosteriorTibial`) REFERENCES `pedal_pulse_description` (`name`),
  ADD CONSTRAINT `fk_physical_exam_investigation` FOREIGN KEY (`investigation`) REFERENCES `physical_exam_investigation` (`name`),
  ADD CONSTRAINT `fk_right_babinski_reflex` FOREIGN KEY (`rightBabinskiReflex`) REFERENCES `babinski_reflex` (`name`),
  ADD CONSTRAINT `fk_right_lower_extremity_edema` FOREIGN KEY (`rightLowerExtremityEdema`) REFERENCES `edema` (`name`),
  ADD CONSTRAINT `fk_right_lower_extremity_foot_temperature` FOREIGN KEY (`rightLowerExtremityFootTemperature`) REFERENCES `foot_temperature` (`name`),
  ADD CONSTRAINT `fk_right_lower_extremity_inflammatory` FOREIGN KEY (`rightLowerExtremityInflammatory`) REFERENCES `inflammatory` (`name`),
  ADD CONSTRAINT `fk_right_lower_extremity_other` FOREIGN KEY (`rightLowerExtremityOther`) REFERENCES `extremity_other_description` (`name`),
  ADD CONSTRAINT `fk_right_monofilament` FOREIGN KEY (`rightMonofilament`) REFERENCES `monofilament` (`name`);

--
-- Constraints for table `physical_exam_abdomen_descriptions`
--
ALTER TABLE `physical_exam_abdomen_descriptions`
  ADD CONSTRAINT `FK_abdomen` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_abdomen` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_appearances`
--
ALTER TABLE `physical_exam_appearances`
  ADD CONSTRAINT `FK_appearance` FOREIGN KEY (`appearance`) REFERENCES `appearances` (`name`),
  ADD CONSTRAINT `FK_physical_exam_appearances` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_axilary_nodes_descriptions`
--
ALTER TABLE `physical_exam_axilary_nodes_descriptions`
  ADD CONSTRAINT `FK_axilary_nodes` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_axilary_nodes` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_back_descriptions`
--
ALTER TABLE `physical_exam_back_descriptions`
  ADD CONSTRAINT `FK_back` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_back` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_chest_descriptions`
--
ALTER TABLE `physical_exam_chest_descriptions`
  ADD CONSTRAINT `FK_chest` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_chest` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_digits_descriptions`
--
ALTER TABLE `physical_exam_digits_descriptions`
  ADD CONSTRAINT `FK_digits` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_digits` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_groin_descriptions`
--
ALTER TABLE `physical_exam_groin_descriptions`
  ADD CONSTRAINT `FK_groin` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_groin` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_head_descriptions`
--
ALTER TABLE `physical_exam_head_descriptions`
  ADD CONSTRAINT `FK_head` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_head` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_inguinal_nodes_descriptions`
--
ALTER TABLE `physical_exam_inguinal_nodes_descriptions`
  ADD CONSTRAINT `FK_inguinal_nodes` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_inguinal_nodes` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_lower_left_extremity_descriptions`
--
ALTER TABLE `physical_exam_lower_left_extremity_descriptions`
  ADD CONSTRAINT `FK_lower_left_extremity` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_lower_left_extremity` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_lower_right_extremity_descriptions`
--
ALTER TABLE `physical_exam_lower_right_extremity_descriptions`
  ADD CONSTRAINT `FK_lower_right_extremity` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_lower_right_extremity` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_mood`
--
ALTER TABLE `physical_exam_mood`
  ADD CONSTRAINT `FK_mood` FOREIGN KEY (`mood`) REFERENCES `mood` (`name`),
  ADD CONSTRAINT `FK_physical_exam_mood` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_neck_descriptions`
--
ALTER TABLE `physical_exam_neck_descriptions`
  ADD CONSTRAINT `FK_neck` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`),
  ADD CONSTRAINT `FK_physical_exam_neck` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_orientation`
--
ALTER TABLE `physical_exam_orientation`
  ADD CONSTRAINT `FK_orientation` FOREIGN KEY (`orientation`) REFERENCES `orientations` (`name`),
  ADD CONSTRAINT `FK_physical_exam_orientation` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`);

--
-- Constraints for table `physical_exam_scalp_descriptions`
--
ALTER TABLE `physical_exam_scalp_descriptions`
  ADD CONSTRAINT `FK_physical_exam_scalp` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`),
  ADD CONSTRAINT `FK_scalp` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`);

--
-- Constraints for table `physical_exam_upper_left_extremitiy_descriptions`
--
ALTER TABLE `physical_exam_upper_left_extremitiy_descriptions`
  ADD CONSTRAINT `FK_physical_exam_upper_left_extremitiy` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`),
  ADD CONSTRAINT `FK_upper_left_extremitiy` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`);

--
-- Constraints for table `physical_exam_upper_right_extremitiy_descriptions`
--
ALTER TABLE `physical_exam_upper_right_extremitiy_descriptions`
  ADD CONSTRAINT `FK_physical_exam_upper_right_extremitiy` FOREIGN KEY (`physicalExamId`) REFERENCES `physical_exam` (`id`),
  ADD CONSTRAINT `FK_upper_right_extremitiy` FOREIGN KEY (`physicalExamDescription`) REFERENCES `physical_exam_description` (`name`);

--
-- Constraints for table `test`
--
ALTER TABLE `test`
  ADD CONSTRAINT `fk_test_progress` FOREIGN KEY (`progress`) REFERENCES `test_progress` (`name`);

--
-- Constraints for table `wounds`
--
ALTER TABLE `wounds`
  ADD CONSTRAINT `FK_amount` FOREIGN KEY (`amount`) REFERENCES `amount` (`name`),
  ADD CONSTRAINT `FK_blister` FOREIGN KEY (`blister`) REFERENCES `blister` (`name`),
  ADD CONSTRAINT `FK_frequency` FOREIGN KEY (`frequency`) REFERENCES `frequency` (`name`),
  ADD CONSTRAINT `fk_biopsy_wounds` FOREIGN KEY (`biopsyId`) REFERENCES `biopsy` (`id`),
  ADD CONSTRAINT `fk_debridement_wounds` FOREIGN KEY (`debridementId`) REFERENCES `debridement` (`id`),
  ADD CONSTRAINT `fk_etiology` FOREIGN KEY (`etiology`) REFERENCES `etiologies` (`name`),
  ADD CONSTRAINT `fk_exudate_wound` FOREIGN KEY (`exudate`) REFERENCES `exudate` (`name`),
  ADD CONSTRAINT `fk_other_wound_tissue` FOREIGN KEY (`otherWoundTissueName`) REFERENCES `other_wound_tissue` (`name`),
  ADD CONSTRAINT `fk_source_of_history` FOREIGN KEY (`sourceOfHistory`) REFERENCES `source_of_history` (`name`),
  ADD CONSTRAINT `fk_wound_location` FOREIGN KEY (`location`) REFERENCES `wound_locations` (`name`),
  ADD CONSTRAINT `fk_wound_progress` FOREIGN KEY (`woundProgress`) REFERENCES `wound_progress` (`name`);

--
-- Constraints for table `wounds_no_debridement_reasons`
--
ALTER TABLE `wounds_no_debridement_reasons`
  ADD CONSTRAINT `FK_no_debridement_reasons` FOREIGN KEY (`noDebridementReason`) REFERENCES `no_debridement_reasons` (`name`),
  ADD CONSTRAINT `FK_wounds_no_debridement_reasons` FOREIGN KEY (`woundId`) REFERENCES `wounds` (`id`);

--
-- Constraints for table `wound_blister`
--
ALTER TABLE `wound_blister`
  ADD CONSTRAINT `FK_blisters` FOREIGN KEY (`blister_id`) REFERENCES `blister` (`name`),
  ADD CONSTRAINT `FK_wound_blisters` FOREIGN KEY (`wound_id`) REFERENCES `wounds` (`id`);

--
-- Constraints for table `wound_descriptions`
--
ALTER TABLE `wound_descriptions`
  ADD CONSTRAINT `FK_description` FOREIGN KEY (`wound_description`) REFERENCES `wound_description` (`name`),
  ADD CONSTRAINT `FK_wound_descriptions` FOREIGN KEY (`wound_id`) REFERENCES `wounds` (`id`);

--
-- Constraints for table `wound_dressings_to_continue`
--
ALTER TABLE `wound_dressings_to_continue`
  ADD CONSTRAINT `FK_dressings_continue` FOREIGN KEY (`dressings_id`) REFERENCES `dressings` (`name`),
  ADD CONSTRAINT `FK_wound_dressings_to_continue` FOREIGN KEY (`wound_id`) REFERENCES `wounds` (`id`);

--
-- Constraints for table `wound_dressings_to_discontinue`
--
ALTER TABLE `wound_dressings_to_discontinue`
  ADD CONSTRAINT `FK_dressings_discontinue` FOREIGN KEY (`dressings_id`) REFERENCES `dressings` (`name`),
  ADD CONSTRAINT `FK_wound_dressings_to_discontinue` FOREIGN KEY (`wound_id`) REFERENCES `wounds` (`id`);

--
-- Constraints for table `wound_dressings_to_start`
--
ALTER TABLE `wound_dressings_to_start`
  ADD CONSTRAINT `FK_dressings_start` FOREIGN KEY (`dressings_id`) REFERENCES `dressings` (`name`),
  ADD CONSTRAINT `FK_wound_dressings_to_start` FOREIGN KEY (`wound_id`) REFERENCES `wounds` (`id`);

--
-- Constraints for table `wound_objectives`
--
ALTER TABLE `wound_objectives`
  ADD CONSTRAINT `FK_wound_objective` FOREIGN KEY (`wound_objective_id`) REFERENCES `wound_objective` (`name`),
  ADD CONSTRAINT `FK_wound_objectivess` FOREIGN KEY (`wound_id`) REFERENCES `wounds` (`id`);

--
-- Constraints for table `wound_periwound`
--
ALTER TABLE `wound_periwound`
  ADD CONSTRAINT `FK_periwound` FOREIGN KEY (`periwound_id`) REFERENCES `periwound` (`name`),
  ADD CONSTRAINT `FK_wound_periwound` FOREIGN KEY (`wound_id`) REFERENCES `wounds` (`id`);

--
-- Constraints for table `wound_recommendations`
--
ALTER TABLE `wound_recommendations`
  ADD CONSTRAINT `FK_recommendations` FOREIGN KEY (`recommendations_id`) REFERENCES `recommendations` (`name`),
  ADD CONSTRAINT `FK_wound_recommendations` FOREIGN KEY (`wound_id`) REFERENCES `wounds` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
