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


val Iconsax.Filled.Export3: ImageVector
    get() {
        if (_Export3 != null) {
            return _Export3!!
        }
        _Export3 = ImageVector.Builder(
            name = "Filled.Export3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.8f, 9f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.25f)
                curveTo(12.75f, 15.66f, 12.41f, 16f, 12f, 16f)
                curveTo(11.59f, 16f, 11.25f, 15.66f, 11.25f, 15.25f)
                verticalLineTo(9f)
                horizontalLineTo(7.2f)
                curveTo(4f, 9f, 2f, 11f, 2f, 14.2f)
                verticalLineTo(16.79f)
                curveTo(2f, 20f, 4f, 22f, 7.2f, 22f)
                horizontalLineTo(16.79f)
                curveTo(19.99f, 22f, 21.99f, 20f, 21.99f, 16.8f)
                verticalLineTo(14.2f)
                curveTo(22f, 11f, 20f, 9f, 16.8f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 4.561f)
                lineTo(14.82f, 6.631f)
                curveTo(14.97f, 6.781f, 15.16f, 6.851f, 15.35f, 6.851f)
                curveTo(15.54f, 6.851f, 15.73f, 6.781f, 15.88f, 6.631f)
                curveTo(16.17f, 6.341f, 16.17f, 5.861f, 15.88f, 5.571f)
                lineTo(12.53f, 2.221f)
                curveTo(12.24f, 1.931f, 11.76f, 1.931f, 11.47f, 2.221f)
                lineTo(8.12f, 5.571f)
                curveTo(7.83f, 5.861f, 7.83f, 6.341f, 8.12f, 6.631f)
                curveTo(8.41f, 6.921f, 8.89f, 6.921f, 9.18f, 6.631f)
                lineTo(11.25f, 4.561f)
                verticalLineTo(9.001f)
                horizontalLineTo(12.75f)
                verticalLineTo(4.561f)
                close()
            }
        }.build()

        return _Export3!!
    }

@Suppress("ObjectPropertyName")
private var _Export3: ImageVector? = null
