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


val Iconsax.Filled.CalendarSearch: ImageVector
    get() {
        if (_CalendarSearch != null) {
            return _CalendarSearch!!
        }
        _CalendarSearch = ImageVector.Builder(
            name = "Filled.CalendarSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 3.56f)
                verticalLineTo(2f)
                curveTo(16.75f, 1.59f, 16.41f, 1.25f, 16f, 1.25f)
                curveTo(15.59f, 1.25f, 15.25f, 1.59f, 15.25f, 2f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(2f)
                curveTo(8.75f, 1.59f, 8.41f, 1.25f, 8f, 1.25f)
                curveTo(7.59f, 1.25f, 7.25f, 1.59f, 7.25f, 2f)
                verticalLineTo(3.56f)
                curveTo(4.55f, 3.81f, 3.24f, 5.42f, 3.04f, 7.81f)
                curveTo(3.02f, 8.1f, 3.26f, 8.34f, 3.54f, 8.34f)
                horizontalLineTo(20.46f)
                curveTo(20.75f, 8.34f, 20.99f, 8.09f, 20.96f, 7.81f)
                curveTo(20.76f, 5.42f, 19.45f, 3.81f, 16.75f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 9.84f)
                horizontalLineTo(4f)
                curveTo(3.45f, 9.84f, 3f, 10.29f, 3f, 10.84f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 4.5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19.5f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(10.84f)
                curveTo(21f, 10.29f, 20.55f, 9.84f, 20f, 9.84f)
                close()
                moveTo(15.66f, 19.53f)
                curveTo(15.51f, 19.68f, 15.32f, 19.75f, 15.13f, 19.75f)
                curveTo(14.94f, 19.75f, 14.75f, 19.68f, 14.6f, 19.53f)
                lineTo(13.86f, 18.79f)
                curveTo(13.28f, 19.17f, 12.58f, 19.4f, 11.83f, 19.4f)
                curveTo(9.79f, 19.4f, 8.13f, 17.74f, 8.13f, 15.7f)
                curveTo(8.13f, 13.66f, 9.79f, 12f, 11.83f, 12f)
                curveTo(13.87f, 12f, 15.53f, 13.66f, 15.53f, 15.7f)
                curveTo(15.53f, 16.45f, 15.3f, 17.15f, 14.92f, 17.73f)
                lineTo(15.66f, 18.47f)
                curveTo(15.95f, 18.76f, 15.95f, 19.24f, 15.66f, 19.53f)
                close()
            }
        }.build()

        return _CalendarSearch!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarSearch: ImageVector? = null
