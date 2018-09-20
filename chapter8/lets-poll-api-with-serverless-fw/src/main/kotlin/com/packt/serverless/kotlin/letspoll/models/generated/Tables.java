/*
 * This file is generated by jOOQ.
 */
package com.packt.serverless.kotlin.letspoll.models.generated;


import com.packt.serverless.kotlin.letspoll.models.generated.tables.Poll;
import com.packt.serverless.kotlin.letspoll.models.generated.tables.Respondent;
import com.packt.serverless.kotlin.letspoll.models.generated.tables.RespondentPollResponse;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {"http://www.jooq.org", "jOOQ version:3.11.2"},
    comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"}) public class Tables {

    /**
     * The table <code>public.poll</code>.
     */
    public static final Poll POLL = Poll.POLL;

    /**
     * The table <code>public.respondent</code>.
     */
    public static final Respondent RESPONDENT = Respondent.RESPONDENT;

    /**
     * The table <code>public.respondent_poll_response</code>.
     */
    public static final RespondentPollResponse RESPONDENT_POLL_RESPONSE =
        RespondentPollResponse.RESPONDENT_POLL_RESPONSE;
}
