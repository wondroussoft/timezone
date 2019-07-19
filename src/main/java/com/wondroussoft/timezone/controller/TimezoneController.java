package com.wondroussoft.timezone.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wondroussoft.timezone.model.Country;
import com.wondroussoft.timezone.model.Language;

@Controller
public class TimezoneController {

	@GetMapping("/")
	public String getHomePage(Model model) {

		List<Language> languages = new ArrayList<Language>();

		Language l = new Language();
		l.setId(1L);
		l.setLanguage("English");

		languages.add(l);

		l = new Language();
		l.setId(2L);
		l.setLanguage("Telugu");

		languages.add(l);

		l = new Language();
		l.setId(3L);
		l.setLanguage("Kannnada");

		languages.add(l);

		l = new Language();
		l.setId(4l);
		l.setLanguage("Hindi");

		languages.add(l);

		l = new Language();
		l.setId(5l);
		l.setLanguage("Tamil");

		languages.add(l);

		model.addAttribute("languages", languages);

		return "index";

	}

	@PostMapping("/countries")
	public String getCountries(Model model, @RequestParam(name = "lang") Long lang) {

		List<Country> countries = new ArrayList<Country>();

		Country c = new Country();
		c.setId(1L);
		if (lang.equals(1L)) {
			c.setNameEng("Hong Kong");
		} else if (lang.equals(2L)) {
			c.setNameTelugu("హాంగ్ కొంగ");
		} else if (lang.equals(3l)) {
			c.setNameKannnada("ಹಾಂಗ್ ಕಾಂಗ್");
		} else if (lang.equals(4l)) {
			c.setNameHindi("हॉगकॉग");
		} else if (lang.equals(5l)) {
			c.setNameTamil("ஹாங் கானா");
		}
		countries.add(c);

		{
			c = new Country();
			c.setId(2L);
			if (lang.equals(1L)) {
				c.setNameEng("America");
			} else if (lang.equals(2L)) {
				c.setNameTelugu("అమెరికా");
			} else if (lang.equals(3l)) {
				c.setNameKannnada("ಅಮೆರಿಕಾ");
			} else if (lang.equals(4l)) {
				c.setNameHindi("अमेरिका");
			} else if (lang.equals(5l)) {
				c.setNameTamil("அமெரிக்கா");
			}
			countries.add(c);

			{
				c = new Country();
				c.setId(3L);
				if (lang.equals(1L)) {
					c.setNameEng("India");
				} else if (lang.equals(2L)) {
					c.setNameTelugu("భారతదేశం");
				} else if (lang.equals(3l)) {
					c.setNameKannnada("ಭಾರತ");
				} else if (lang.equals(4l)) {
					c.setNameHindi("इंडिया");
				} else if (lang.equals(5l)) {
					c.setNameTamil("இந்தியாவில்");
				}
				countries.add(c);

				{
					c = new Country();
					c.setId(4L);
					if (lang.equals(1L)) {
						c.setNameEng("Canada");
					} else if (lang.equals(2L)) {
						c.setNameTelugu("కెనడా");
					} else if (lang.equals(3l)) {
						c.setNameKannnada("ಕೆನಡಾ");
					} else if (lang.equals(4l)) {
						c.setNameHindi("कनाडा");
					} else if (lang.equals(5l)) {
						c.setNameTamil("கனடா");
					}
					countries.add(c);

					{
						c = new Country();
						c.setId(5L);
						if (lang.equals(1L)) {
							c.setNameEng("Brazil");
						} else if (lang.equals(2L)) {
							c.setNameTelugu("బ్రెజిల్");
						} else if (lang.equals(3l)) {
							c.setNameKannnada("ಬ್ರೆಜಿಲ್");
						} else if (lang.equals(4l)) {
							c.setNameHindi("ब्राज़िल");
						} else if (lang.equals(5l)) {
							c.setNameTamil("பிரேசில்");
						}
						countries.add(c);

						model.addAttribute("countries", countries);
						model.addAttribute("language", lang);

						return "countries";

					}
				}
			}
		}
	}
}