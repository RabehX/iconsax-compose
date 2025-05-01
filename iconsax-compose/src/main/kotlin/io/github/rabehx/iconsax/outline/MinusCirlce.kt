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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.MinusCirlce: ImageVector
    get() {
        if (_MinusCirlce != null) {
            return _MinusCirlce!!
        }
        _MinusCirlce = ImageVector.Builder(
            name = "Outline.MinusCirlce",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.92f, 22.75f)
                curveTo(6f, 22.75f, 1.17f, 17.93f, 1.17f, 12f)
                curveTo(1.17f, 6.07f, 6f, 1.25f, 11.92f, 1.25f)
                curveTo(17.84f, 1.25f, 22.67f, 6.07f, 22.67f, 12f)
                curveTo(22.67f, 17.93f, 17.85f, 22.75f, 11.92f, 22.75f)
                close()
                moveTo(11.92f, 2.75f)
                curveTo(6.82f, 2.75f, 2.67f, 6.9f, 2.67f, 12f)
                curveTo(2.67f, 17.1f, 6.82f, 21.25f, 11.92f, 21.25f)
                curveTo(17.02f, 21.25f, 21.17f, 17.1f, 21.17f, 12f)
                curveTo(21.17f, 6.9f, 17.02f, 2.75f, 11.92f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.92f, 12.75f)
                horizontalLineTo(7.92f)
                curveTo(7.51f, 12.75f, 7.17f, 12.41f, 7.17f, 12f)
                curveTo(7.17f, 11.59f, 7.51f, 11.25f, 7.92f, 11.25f)
                horizontalLineTo(15.92f)
                curveTo(16.33f, 11.25f, 16.67f, 11.59f, 16.67f, 12f)
                curveTo(16.67f, 12.41f, 16.34f, 12.75f, 15.92f, 12.75f)
                close()
            }
        }.build()

        return _MinusCirlce!!
    }

@Suppress("ObjectPropertyName")
private var _MinusCirlce: ImageVector? = null
