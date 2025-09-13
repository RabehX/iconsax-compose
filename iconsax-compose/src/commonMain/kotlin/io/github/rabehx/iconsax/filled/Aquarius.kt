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

val Iconsax.Filled.Aquarius: ImageVector
    get() {
        if (_Aquarius != null) {
            return _Aquarius!!
        }
        _Aquarius = ImageVector.Builder(
            name = "Filled.Aquarius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.75f, 9f)
                curveTo(19.75f, 4.73f, 16.27f, 1.25f, 12f, 1.25f)
                curveTo(7.73f, 1.25f, 4.25f, 4.73f, 4.25f, 9f)
                curveTo(4.25f, 9.41f, 4.59f, 9.75f, 5f, 9.75f)
                curveTo(5.41f, 9.75f, 5.75f, 9.41f, 5.75f, 9f)
                curveTo(5.75f, 5.55f, 8.55f, 2.75f, 12f, 2.75f)
                curveTo(15.45f, 2.75f, 18.25f, 5.55f, 18.25f, 9f)
                curveTo(18.25f, 12.45f, 15.45f, 15.25f, 12f, 15.25f)
                curveTo(11.59f, 15.25f, 11.25f, 15.59f, 11.25f, 16f)
                verticalLineTo(22f)
                curveTo(11.25f, 22.41f, 11.59f, 22.75f, 12f, 22.75f)
                curveTo(12.41f, 22.75f, 12.75f, 22.41f, 12.75f, 22f)
                verticalLineTo(16.71f)
                curveTo(16.67f, 16.33f, 19.75f, 13.02f, 19.75f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 19.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 19.75f, 8.25f, 19.41f, 8.25f, 19f)
                curveTo(8.25f, 18.59f, 8.59f, 18.25f, 9f, 18.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 18.25f, 15.75f, 18.59f, 15.75f, 19f)
                curveTo(15.75f, 19.41f, 15.41f, 19.75f, 15f, 19.75f)
                close()
            }
        }.build()

        return _Aquarius!!
    }

@Suppress("ObjectPropertyName")
private var _Aquarius: ImageVector? = null
