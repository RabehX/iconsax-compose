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


val Iconsax.Filled.Ticket2: ImageVector
    get() {
        if (_Ticket2 != null) {
            return _Ticket2!!
        }
        _Ticket2 = ImageVector.Builder(
            name = "Filled.Ticket2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.189f, 4.96f)
                curveTo(17.189f, 4.97f, 17.189f, 4.97f, 17.189f, 4.98f)
                curveTo(16.939f, 4.97f, 16.689f, 4.96f, 16.419f, 4.96f)
                horizontalLineTo(8.719f)
                lineTo(9.789f, 3.9f)
                curveTo(10.769f, 2.91f, 11.849f, 2f, 13.099f, 2f)
                curveTo(14.359f, 2f, 15.439f, 2.91f, 16.419f, 3.9f)
                lineTo(16.979f, 4.46f)
                curveTo(17.119f, 4.59f, 17.189f, 4.77f, 17.189f, 4.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.841f, 13.169f)
                curveTo(21.231f, 13.169f, 21.541f, 12.849f, 21.541f, 12.449f)
                verticalLineTo(11.569f)
                curveTo(21.541f, 7.639f, 20.341f, 6.449f, 16.421f, 6.449f)
                horizontalLineTo(10.121f)
                horizontalLineTo(7.581f)
                curveTo(3.661f, 6.449f, 2.461f, 7.649f, 2.461f, 11.569f)
                verticalLineTo(11.999f)
                curveTo(2.461f, 12.399f, 2.771f, 12.709f, 3.161f, 12.709f)
                curveTo(4.001f, 12.709f, 4.671f, 13.389f, 4.671f, 14.219f)
                curveTo(4.671f, 15.049f, 4.001f, 15.739f, 3.161f, 15.739f)
                curveTo(2.771f, 15.739f, 2.461f, 16.049f, 2.461f, 16.449f)
                verticalLineTo(16.879f)
                curveTo(2.461f, 20.809f, 3.661f, 21.999f, 7.581f, 21.999f)
                horizontalLineTo(10.111f)
                horizontalLineTo(16.411f)
                curveTo(20.331f, 21.999f, 21.531f, 20.799f, 21.531f, 16.879f)
                curveTo(21.531f, 16.489f, 21.221f, 16.169f, 20.831f, 16.169f)
                curveTo(19.991f, 16.169f, 19.321f, 15.499f, 19.321f, 14.669f)
                curveTo(19.331f, 13.839f, 20.001f, 13.169f, 20.841f, 13.169f)
                close()
                moveTo(10.821f, 18.859f)
                curveTo(10.821f, 19.249f, 10.501f, 19.569f, 10.111f, 19.569f)
                curveTo(9.721f, 19.569f, 9.401f, 19.249f, 9.401f, 18.859f)
                verticalLineTo(16.179f)
                curveTo(9.401f, 15.789f, 9.721f, 15.469f, 10.111f, 15.469f)
                curveTo(10.501f, 15.469f, 10.821f, 15.789f, 10.821f, 16.179f)
                verticalLineTo(18.859f)
                close()
                moveTo(10.821f, 12.269f)
                curveTo(10.821f, 12.659f, 10.501f, 12.979f, 10.111f, 12.979f)
                curveTo(9.721f, 12.979f, 9.401f, 12.659f, 9.401f, 12.269f)
                verticalLineTo(9.589f)
                curveTo(9.401f, 9.199f, 9.721f, 8.879f, 10.111f, 8.879f)
                curveTo(10.501f, 8.879f, 10.821f, 9.199f, 10.821f, 9.589f)
                verticalLineTo(12.269f)
                close()
            }
        }.build()

        return _Ticket2!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket2: ImageVector? = null
