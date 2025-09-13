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


val Iconsax.Filled.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) {
            return _Keyboard!!
        }
        _Keyboard = ImageVector.Builder(
            name = "Filled.Keyboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.27f, 3.35f)
                curveTo(17.8f, 3.28f, 17.26f, 3.25f, 16.5f, 3.25f)
                horizontalLineTo(7.5f)
                curveTo(6.75f, 3.25f, 6.2f, 3.28f, 5.76f, 3.34f)
                curveTo(2.41f, 3.71f, 1.75f, 5.7f, 1.75f, 9f)
                verticalLineTo(15f)
                curveTo(1.75f, 18.3f, 2.41f, 20.29f, 5.73f, 20.65f)
                curveTo(6.2f, 20.72f, 6.74f, 20.75f, 7.5f, 20.75f)
                horizontalLineTo(16.5f)
                curveTo(17.25f, 20.75f, 17.8f, 20.72f, 18.24f, 20.66f)
                curveTo(21.59f, 20.29f, 22.25f, 18.31f, 22.25f, 15f)
                verticalLineTo(9f)
                curveTo(22.25f, 5.7f, 21.59f, 3.71f, 18.27f, 3.35f)
                close()
                moveTo(10.09f, 9f)
                curveTo(10.65f, 9f, 11.1f, 9.45f, 11.1f, 10f)
                curveTo(11.1f, 10.55f, 10.65f, 11f, 10.1f, 11f)
                curveTo(9.55f, 11f, 9.1f, 10.55f, 9.1f, 10f)
                curveTo(9.1f, 9.45f, 9.54f, 9f, 10.09f, 9f)
                close()
                moveTo(7.09f, 9f)
                curveTo(7.66f, 9f, 8.1f, 9.45f, 8.1f, 10f)
                curveTo(8.1f, 10.55f, 7.65f, 11f, 7.1f, 11f)
                curveTo(6.55f, 11f, 6.1f, 10.55f, 6.1f, 10f)
                curveTo(6.1f, 9.45f, 6.54f, 9f, 7.09f, 9f)
                close()
                moveTo(17f, 16.25f)
                horizontalLineTo(7.02f)
                curveTo(6.61f, 16.25f, 6.26f, 15.91f, 6.26f, 15.5f)
                curveTo(6.26f, 15.09f, 6.59f, 14.75f, 7f, 14.75f)
                horizontalLineTo(17f)
                curveTo(17.41f, 14.75f, 17.75f, 15.09f, 17.75f, 15.5f)
                curveTo(17.75f, 15.91f, 17.41f, 16.25f, 17f, 16.25f)
                close()
                moveTo(17f, 10.75f)
                horizontalLineTo(13.5f)
                curveTo(13.09f, 10.75f, 12.75f, 10.41f, 12.75f, 10f)
                curveTo(12.75f, 9.59f, 13.09f, 9.25f, 13.5f, 9.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 9.25f, 17.75f, 9.59f, 17.75f, 10f)
                curveTo(17.75f, 10.41f, 17.41f, 10.75f, 17f, 10.75f)
                close()
            }
        }.build()

        return _Keyboard!!
    }

@Suppress("ObjectPropertyName")
private var _Keyboard: ImageVector? = null
