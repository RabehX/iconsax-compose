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


val Iconsax.Filled.Chart2: ImageVector
    get() {
        if (_Chart2 != null) {
            return _Chart2!!
        }
        _Chart2 = ImageVector.Builder(
            name = "Filled.Chart2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22f, 22f, 19.83f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(7.75f, 13.6f)
                curveTo(7.75f, 14.01f, 7.41f, 14.35f, 7f, 14.35f)
                curveTo(6.59f, 14.35f, 6.25f, 14.01f, 6.25f, 13.6f)
                verticalLineTo(10.4f)
                curveTo(6.25f, 9.99f, 6.59f, 9.65f, 7f, 9.65f)
                curveTo(7.41f, 9.65f, 7.75f, 9.99f, 7.75f, 10.4f)
                verticalLineTo(13.6f)
                close()
                moveTo(12.75f, 15.34f)
                curveTo(12.75f, 15.75f, 12.41f, 16.09f, 12f, 16.09f)
                curveTo(11.59f, 16.09f, 11.25f, 15.75f, 11.25f, 15.34f)
                verticalLineTo(8.66f)
                curveTo(11.25f, 8.25f, 11.59f, 7.91f, 12f, 7.91f)
                curveTo(12.41f, 7.91f, 12.75f, 8.25f, 12.75f, 8.66f)
                verticalLineTo(15.34f)
                close()
                moveTo(17.75f, 13.6f)
                curveTo(17.75f, 14.01f, 17.41f, 14.35f, 17f, 14.35f)
                curveTo(16.59f, 14.35f, 16.25f, 14.01f, 16.25f, 13.6f)
                verticalLineTo(10.4f)
                curveTo(16.25f, 9.99f, 16.59f, 9.65f, 17f, 9.65f)
                curveTo(17.41f, 9.65f, 17.75f, 9.99f, 17.75f, 10.4f)
                verticalLineTo(13.6f)
                close()
            }
        }.build()

        return _Chart2!!
    }

@Suppress("ObjectPropertyName")
private var _Chart2: ImageVector? = null
