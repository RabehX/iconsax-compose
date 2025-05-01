/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.TicketExpired: ImageVector
    get() {
        if (_TicketExpired != null) {
            return _TicketExpired!!
        }
        _TicketExpired = ImageVector.Builder(
            name = "Filled.TicketExpired",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.85f, 12.941f)
                curveTo(19.85f, 13.741f, 20.5f, 14.401f, 21.3f, 14.401f)
                curveTo(21.68f, 14.401f, 22f, 14.711f, 22f, 15.091f)
                curveTo(22f, 18.931f, 20.84f, 20.091f, 17f, 20.091f)
                horizontalLineTo(11.75f)
                verticalLineTo(18.501f)
                curveTo(11.75f, 18.111f, 11.45f, 17.791f, 11.07f, 17.761f)
                curveTo(11.05f, 17.751f, 11.02f, 17.751f, 11f, 17.751f)
                curveTo(10.59f, 17.751f, 10.25f, 18.091f, 10.25f, 18.501f)
                verticalLineTo(20.091f)
                horizontalLineTo(8.49f)
                curveTo(6.61f, 20.091f, 5.64f, 18.681f, 4.76f, 16.551f)
                lineTo(4.59f, 16.131f)
                curveTo(4.45f, 15.771f, 4.62f, 15.361f, 4.98f, 15.221f)
                curveTo(5.35f, 15.081f, 5.64f, 14.791f, 5.79f, 14.411f)
                curveTo(5.95f, 14.041f, 5.95f, 13.631f, 5.8f, 13.261f)
                curveTo(5.48f, 12.491f, 4.6f, 12.121f, 3.82f, 12.431f)
                curveTo(3.65f, 12.511f, 3.45f, 12.511f, 3.28f, 12.431f)
                curveTo(3.11f, 12.361f, 2.98f, 12.221f, 2.9f, 12.041f)
                lineTo(2.75f, 11.641f)
                curveTo(1.26f, 8.021f, 1.91f, 6.471f, 5.53f, 4.971f)
                lineTo(7.98f, 3.961f)
                curveTo(8.34f, 3.811f, 8.75f, 3.981f, 8.89f, 4.341f)
                lineTo(11.07f, 9.091f)
                curveTo(10.66f, 9.091f, 10.25f, 9.421f, 10.25f, 9.831f)
                verticalLineTo(14.171f)
                curveTo(10.25f, 14.581f, 10.59f, 14.921f, 11f, 14.921f)
                curveTo(11.02f, 14.921f, 11.05f, 14.921f, 11.07f, 14.911f)
                curveTo(11.45f, 14.881f, 11.75f, 14.561f, 11.75f, 14.171f)
                verticalLineTo(9.831f)
                curveTo(11.75f, 9.441f, 11.45f, 9.121f, 11.07f, 9.091f)
                verticalLineTo(4.931f)
                horizontalLineTo(17f)
                curveTo(20.84f, 4.931f, 22f, 6.091f, 22f, 9.931f)
                verticalLineTo(10.781f)
                curveTo(22f, 11.171f, 21.68f, 11.481f, 21.3f, 11.481f)
                curveTo(20.5f, 11.481f, 19.85f, 12.131f, 19.85f, 12.941f)
                close()
            }
        }.build()

        return _TicketExpired!!
    }

@Suppress("ObjectPropertyName")
private var _TicketExpired: ImageVector? = null
