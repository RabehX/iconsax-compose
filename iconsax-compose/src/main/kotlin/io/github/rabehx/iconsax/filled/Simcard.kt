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


val Iconsax.Filled.Simcard: ImageVector
    get() {
        if (_Simcard != null) {
            return _Simcard!!
        }
        _Simcard = ImageVector.Builder(
            name = "Filled.Simcard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.54f, 6.54f)
                lineTo(16.47f, 3.47f)
                curveTo(15.53f, 2.53f, 14.26f, 2f, 12.93f, 2f)
                horizontalLineTo(8f)
                curveTo(5f, 2f, 3f, 4f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(10.07f)
                curveTo(21f, 8.74f, 20.47f, 7.47f, 19.54f, 6.54f)
                close()
                moveTo(10.03f, 17.47f)
                curveTo(10.32f, 17.76f, 10.32f, 18.24f, 10.03f, 18.53f)
                curveTo(9.88f, 18.68f, 9.69f, 18.75f, 9.5f, 18.75f)
                curveTo(9.31f, 18.75f, 9.12f, 18.68f, 8.97f, 18.53f)
                lineTo(6.97f, 16.53f)
                curveTo(6.68f, 16.24f, 6.68f, 15.76f, 6.97f, 15.47f)
                lineTo(8.97f, 13.47f)
                curveTo(9.26f, 13.18f, 9.74f, 13.18f, 10.03f, 13.47f)
                curveTo(10.32f, 13.76f, 10.32f, 14.24f, 10.03f, 14.53f)
                lineTo(8.56f, 16f)
                lineTo(10.03f, 17.47f)
                close()
                moveTo(17.03f, 16.53f)
                lineTo(15.03f, 18.53f)
                curveTo(14.88f, 18.68f, 14.69f, 18.75f, 14.5f, 18.75f)
                curveTo(14.31f, 18.75f, 14.12f, 18.68f, 13.97f, 18.53f)
                curveTo(13.68f, 18.24f, 13.68f, 17.76f, 13.97f, 17.47f)
                lineTo(15.44f, 16f)
                lineTo(13.97f, 14.53f)
                curveTo(13.68f, 14.24f, 13.68f, 13.76f, 13.97f, 13.47f)
                curveTo(14.26f, 13.18f, 14.74f, 13.18f, 15.03f, 13.47f)
                lineTo(17.03f, 15.47f)
                curveTo(17.32f, 15.76f, 17.32f, 16.24f, 17.03f, 16.53f)
                close()
            }
        }.build()

        return _Simcard!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard: ImageVector? = null
