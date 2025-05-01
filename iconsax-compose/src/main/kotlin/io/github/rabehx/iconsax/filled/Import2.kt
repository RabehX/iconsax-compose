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


val Iconsax.Filled.Import2: ImageVector
    get() {
        if (_Import2 != null) {
            return _Import2!!
        }
        _Import2 = ImageVector.Builder(
            name = "Filled.Import2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.8f, 9f)
                horizontalLineTo(12.75f)
                verticalLineTo(13.44f)
                lineTo(14.82f, 11.37f)
                curveTo(14.97f, 11.22f, 15.16f, 11.15f, 15.35f, 11.15f)
                curveTo(15.54f, 11.15f, 15.73f, 11.22f, 15.88f, 11.37f)
                curveTo(16.17f, 11.66f, 16.17f, 12.14f, 15.88f, 12.43f)
                lineTo(12.53f, 15.78f)
                curveTo(12.24f, 16.07f, 11.76f, 16.07f, 11.47f, 15.78f)
                lineTo(8.12f, 12.43f)
                curveTo(7.83f, 12.14f, 7.83f, 11.66f, 8.12f, 11.37f)
                curveTo(8.41f, 11.08f, 8.89f, 11.08f, 9.18f, 11.37f)
                lineTo(11.25f, 13.44f)
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
                moveTo(12.75f, 2.75f)
                curveTo(12.75f, 2.34f, 12.41f, 2f, 12f, 2f)
                curveTo(11.59f, 2f, 11.25f, 2.34f, 11.25f, 2.75f)
                verticalLineTo(9f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.75f)
                close()
            }
        }.build()

        return _Import2!!
    }

@Suppress("ObjectPropertyName")
private var _Import2: ImageVector? = null
