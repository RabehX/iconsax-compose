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

val Iconsax.Outline.Brush3: ImageVector
    get() {
        if (_Brush3 != null) {
            return _Brush3!!
        }
        _Brush3 = ImageVector.Builder(
            name = "Outline.Brush3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 9.07f)
                horizontalLineTo(4f)
                curveTo(3.59f, 9.07f, 3.25f, 8.73f, 3.25f, 8.32f)
                verticalLineTo(4f)
                curveTo(3.25f, 2.48f, 4.48f, 1.25f, 6f, 1.25f)
                horizontalLineTo(18f)
                curveTo(19.52f, 1.25f, 20.75f, 2.48f, 20.75f, 4f)
                verticalLineTo(8.32f)
                curveTo(20.75f, 8.73f, 20.41f, 9.07f, 20f, 9.07f)
                close()
                moveTo(4.75f, 7.57f)
                horizontalLineTo(19.25f)
                verticalLineTo(4f)
                curveTo(19.25f, 3.31f, 18.69f, 2.75f, 18f, 2.75f)
                horizontalLineTo(6f)
                curveTo(5.31f, 2.75f, 4.75f, 3.31f, 4.75f, 4f)
                verticalLineTo(7.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 22.75f)
                horizontalLineTo(11.5f)
                curveTo(9.98f, 22.75f, 8.75f, 21.52f, 8.75f, 20f)
                verticalLineTo(17.9f)
                curveTo(8.75f, 17.45f, 8.51f, 17.03f, 8.11f, 16.81f)
                lineTo(5.15f, 15.14f)
                curveTo(3.97f, 14.48f, 3.24f, 13.23f, 3.24f, 11.87f)
                verticalLineTo(8.31f)
                curveTo(3.24f, 7.9f, 3.58f, 7.56f, 3.99f, 7.56f)
                horizontalLineTo(19.99f)
                curveTo(20.4f, 7.56f, 20.74f, 7.9f, 20.74f, 8.31f)
                verticalLineTo(11.87f)
                curveTo(20.74f, 13.22f, 20.01f, 14.47f, 18.83f, 15.14f)
                lineTo(15.87f, 16.81f)
                curveTo(15.48f, 17.03f, 15.23f, 17.45f, 15.23f, 17.9f)
                verticalLineTo(20f)
                curveTo(15.25f, 21.52f, 14.02f, 22.75f, 12.5f, 22.75f)
                close()
                moveTo(4.75f, 9.07f)
                verticalLineTo(11.88f)
                curveTo(4.75f, 12.69f, 5.19f, 13.44f, 5.89f, 13.84f)
                lineTo(8.85f, 15.51f)
                curveTo(9.71f, 16f, 10.25f, 16.91f, 10.25f, 17.9f)
                verticalLineTo(20f)
                curveTo(10.25f, 20.69f, 10.81f, 21.25f, 11.5f, 21.25f)
                horizontalLineTo(12.5f)
                curveTo(13.19f, 21.25f, 13.75f, 20.69f, 13.75f, 20f)
                verticalLineTo(17.9f)
                curveTo(13.75f, 16.91f, 14.29f, 15.99f, 15.15f, 15.51f)
                lineTo(18.11f, 13.84f)
                curveTo(18.82f, 13.44f, 19.25f, 12.69f, 19.25f, 11.88f)
                verticalLineTo(9.07f)
                horizontalLineTo(4.75f)
                close()
            }
        }.build()

        return _Brush3!!
    }

@Suppress("ObjectPropertyName")
private var _Brush3: ImageVector? = null
