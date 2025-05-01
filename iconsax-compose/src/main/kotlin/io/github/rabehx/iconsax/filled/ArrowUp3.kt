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

val Iconsax.Filled.ArrowUp3: ImageVector
    get() {
        if (_ArrowUp3 != null) {
            return _ArrowUp3!!
        }
        _ArrowUp3 = ImageVector.Builder(
            name = "Filled.ArrowUp3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(16.82f, 10.82f)
                curveTo(16.53f, 11.11f, 16.05f, 11.11f, 15.76f, 10.82f)
                lineTo(12.75f, 7.81f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(7.81f)
                lineTo(8.24f, 10.82f)
                curveTo(7.95f, 11.11f, 7.47f, 11.11f, 7.18f, 10.82f)
                curveTo(7.03f, 10.67f, 6.96f, 10.48f, 6.96f, 10.29f)
                curveTo(6.96f, 10.1f, 7.04f, 9.9f, 7.18f, 9.76f)
                lineTo(11.47f, 5.47f)
                curveTo(11.61f, 5.33f, 11.8f, 5.25f, 12f, 5.25f)
                curveTo(12.2f, 5.25f, 12.39f, 5.33f, 12.53f, 5.47f)
                lineTo(16.82f, 9.76f)
                curveTo(17.11f, 10.05f, 17.11f, 10.52f, 16.82f, 10.82f)
                close()
            }
        }.build()

        return _ArrowUp3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp3: ImageVector? = null
