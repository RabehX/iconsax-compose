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

val Iconsax.Outline.Lamp: ImageVector
    get() {
        if (_Lamp != null) {
            return _Lamp!!
        }
        _Lamp = ImageVector.Builder(
            name = "Outline.Lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.21f, 15.44f)
                horizontalLineTo(5.79f)
                curveTo(4.76f, 15.44f, 3.85f, 15.02f, 3.29f, 14.29f)
                curveTo(2.73f, 13.56f, 2.57f, 12.57f, 2.84f, 11.58f)
                lineTo(5.04f, 3.5f)
                curveTo(5.38f, 2.24f, 6.68f, 1.25f, 7.99f, 1.25f)
                horizontalLineTo(16f)
                curveTo(17.31f, 1.25f, 18.6f, 2.24f, 18.95f, 3.5f)
                lineTo(21.15f, 11.58f)
                curveTo(21.42f, 12.57f, 21.26f, 13.56f, 20.7f, 14.29f)
                curveTo(20.14f, 15.02f, 19.24f, 15.44f, 18.21f, 15.44f)
                close()
                moveTo(7.99f, 2.75f)
                curveTo(7.36f, 2.75f, 6.65f, 3.29f, 6.49f, 3.9f)
                lineTo(4.29f, 11.98f)
                curveTo(4.14f, 12.52f, 4.21f, 13.02f, 4.49f, 13.39f)
                curveTo(4.77f, 13.76f, 5.23f, 13.95f, 5.79f, 13.95f)
                horizontalLineTo(18.21f)
                curveTo(18.77f, 13.95f, 19.24f, 13.75f, 19.51f, 13.39f)
                curveTo(19.78f, 13.03f, 19.86f, 12.53f, 19.71f, 11.98f)
                lineTo(17.51f, 3.9f)
                curveTo(17.34f, 3.29f, 16.64f, 2.75f, 16.01f, 2.75f)
                horizontalLineTo(7.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(15f)
                curveTo(11.25f, 14.59f, 11.59f, 14.25f, 12f, 14.25f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 22.75f, 7.25f, 22.41f, 7.25f, 22f)
                curveTo(7.25f, 21.59f, 7.59f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 21.25f, 16.75f, 21.59f, 16.75f, 22f)
                curveTo(16.75f, 22.41f, 16.41f, 22.75f, 16f, 22.75f)
                close()
            }
        }.build()

        return _Lamp!!
    }

@Suppress("ObjectPropertyName")
private var _Lamp: ImageVector? = null
