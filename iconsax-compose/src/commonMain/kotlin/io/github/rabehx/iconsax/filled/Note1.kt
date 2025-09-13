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


val Iconsax.Filled.Note1: ImageVector
    get() {
        if (_Note1 != null) {
            return _Note1!!
        }
        _Note1 = ImageVector.Builder(
            name = "Filled.Note1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 4.25f)
                curveTo(16f, 5.49f, 14.99f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.63f, 6.5f, 9.07f, 6.25f, 8.66f, 5.84f)
                curveTo(8.25f, 5.43f, 8f, 4.87f, 8f, 4.25f)
                curveTo(8f, 3.01f, 9.01f, 2f, 10.25f, 2f)
                horizontalLineTo(13.75f)
                curveTo(14.37f, 2f, 14.93f, 2.25f, 15.34f, 2.66f)
                curveTo(15.75f, 3.07f, 16f, 3.63f, 16f, 4.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.83f, 5.029f)
                curveTo(18.6f, 4.839f, 18.34f, 4.689f, 18.06f, 4.579f)
                curveTo(17.77f, 4.469f, 17.48f, 4.699f, 17.42f, 4.999f)
                curveTo(17.08f, 6.709f, 15.57f, 7.999f, 13.75f, 7.999f)
                horizontalLineTo(10.25f)
                curveTo(9.25f, 7.999f, 8.31f, 7.609f, 7.6f, 6.899f)
                curveTo(7.08f, 6.379f, 6.72f, 5.719f, 6.58f, 5.009f)
                curveTo(6.52f, 4.709f, 6.22f, 4.469f, 5.93f, 4.589f)
                curveTo(4.77f, 5.059f, 4f, 6.119f, 4f, 8.249f)
                verticalLineTo(17.999f)
                curveTo(4f, 20.999f, 5.79f, 21.999f, 8f, 21.999f)
                horizontalLineTo(16f)
                curveTo(18.21f, 21.999f, 20f, 20.999f, 20f, 17.999f)
                verticalLineTo(8.249f)
                curveTo(20f, 6.619f, 19.55f, 5.619f, 18.83f, 5.029f)
                close()
                moveTo(8f, 12.249f)
                horizontalLineTo(12f)
                curveTo(12.41f, 12.249f, 12.75f, 12.589f, 12.75f, 12.999f)
                curveTo(12.75f, 13.409f, 12.41f, 13.749f, 12f, 13.749f)
                horizontalLineTo(8f)
                curveTo(7.59f, 13.749f, 7.25f, 13.409f, 7.25f, 12.999f)
                curveTo(7.25f, 12.589f, 7.59f, 12.249f, 8f, 12.249f)
                close()
                moveTo(16f, 17.749f)
                horizontalLineTo(8f)
                curveTo(7.59f, 17.749f, 7.25f, 17.409f, 7.25f, 16.999f)
                curveTo(7.25f, 16.589f, 7.59f, 16.249f, 8f, 16.249f)
                horizontalLineTo(16f)
                curveTo(16.41f, 16.249f, 16.75f, 16.589f, 16.75f, 16.999f)
                curveTo(16.75f, 17.409f, 16.41f, 17.749f, 16f, 17.749f)
                close()
            }
        }.build()

        return _Note1!!
    }

@Suppress("ObjectPropertyName")
private var _Note1: ImageVector? = null
