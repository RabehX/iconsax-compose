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


val Iconsax.Filled.Chart3: ImageVector
    get() {
        if (_Chart3 != null) {
            return _Chart3!!
        }
        _Chart3 = ImageVector.Builder(
            name = "Filled.Chart3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22f, 1.25f, 21.66f, 1.25f, 21.25f)
                curveTo(1.25f, 20.84f, 1.59f, 20.5f, 2f, 20.5f)
                horizontalLineTo(22f)
                curveTo(22.41f, 20.5f, 22.75f, 20.84f, 22.75f, 21.25f)
                curveTo(22.75f, 21.66f, 22.41f, 22f, 22f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.75f, 4f)
                verticalLineTo(22f)
                horizontalLineTo(14.25f)
                verticalLineTo(4f)
                curveTo(14.25f, 2.9f, 13.8f, 2f, 12.45f, 2f)
                horizontalLineTo(11.55f)
                curveTo(10.2f, 2f, 9.75f, 2.9f, 9.75f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 10f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                curveTo(7f, 8.9f, 6.6f, 8f, 5.4f, 8f)
                horizontalLineTo(4.6f)
                curveTo(3.4f, 8f, 3f, 8.9f, 3f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 15f)
                verticalLineTo(22f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                curveTo(21f, 13.9f, 20.6f, 13f, 19.4f, 13f)
                horizontalLineTo(18.6f)
                curveTo(17.4f, 13f, 17f, 13.9f, 17f, 15f)
                close()
            }
        }.build()

        return _Chart3!!
    }

@Suppress("ObjectPropertyName")
private var _Chart3: ImageVector? = null
