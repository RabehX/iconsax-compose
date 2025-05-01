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

val Iconsax.Outline.Shapes: ImageVector
    get() {
        if (_Shapes != null) {
            return _Shapes!!
        }
        _Shapes = ImageVector.Builder(
            name = "Outline.Shapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.43f, 15.75f)
                horizontalLineTo(4.4f)
                curveTo(3.28f, 15.75f, 2.26f, 15.17f, 1.69f, 14.2f)
                curveTo(1.12f, 13.23f, 1.1f, 12.07f, 1.64f, 11.08f)
                lineTo(6.15f, 2.87f)
                curveTo(6.71f, 1.85f, 7.74f, 1.24f, 8.91f, 1.24f)
                curveTo(10.08f, 1.24f, 11.11f, 1.85f, 11.67f, 2.87f)
                lineTo(16.19f, 11.08f)
                curveTo(16.73f, 12.06f, 16.71f, 13.23f, 16.14f, 14.2f)
                curveTo(15.57f, 15.17f, 14.55f, 15.75f, 13.43f, 15.75f)
                close()
                moveTo(8.91f, 2.75f)
                curveTo(8.3f, 2.75f, 7.76f, 3.07f, 7.47f, 3.6f)
                lineTo(2.96f, 11.81f)
                curveTo(2.68f, 12.33f, 2.69f, 12.93f, 2.98f, 13.44f)
                curveTo(3.28f, 13.95f, 3.81f, 14.25f, 4.4f, 14.25f)
                horizontalLineTo(13.43f)
                curveTo(14.02f, 14.25f, 14.55f, 13.95f, 14.85f, 13.44f)
                curveTo(15.15f, 12.93f, 15.16f, 12.33f, 14.87f, 11.81f)
                lineTo(10.35f, 3.6f)
                curveTo(10.06f, 3.07f, 9.52f, 2.75f, 8.91f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 22.75f)
                curveTo(11.5f, 22.75f, 8.25f, 19.5f, 8.25f, 15.5f)
                curveTo(8.25f, 15.32f, 8.26f, 15.14f, 8.27f, 14.96f)
                curveTo(8.29f, 14.56f, 8.62f, 14.25f, 9.02f, 14.25f)
                horizontalLineTo(13.43f)
                curveTo(14.02f, 14.25f, 14.55f, 13.95f, 14.85f, 13.44f)
                curveTo(15.15f, 12.93f, 15.16f, 12.33f, 14.87f, 11.81f)
                lineTo(13.59f, 9.48f)
                curveTo(13.47f, 9.27f, 13.47f, 9.02f, 13.57f, 8.8f)
                curveTo(13.67f, 8.58f, 13.87f, 8.43f, 14.1f, 8.38f)
                curveTo(14.55f, 8.29f, 15.02f, 8.25f, 15.5f, 8.25f)
                curveTo(19.5f, 8.25f, 22.75f, 11.5f, 22.75f, 15.5f)
                curveTo(22.75f, 19.5f, 19.5f, 22.75f, 15.5f, 22.75f)
                close()
                moveTo(9.76f, 15.75f)
                curveTo(9.89f, 18.81f, 12.42f, 21.25f, 15.5f, 21.25f)
                curveTo(18.67f, 21.25f, 21.25f, 18.67f, 21.25f, 15.5f)
                curveTo(21.25f, 12.33f, 18.67f, 9.75f, 15.5f, 9.75f)
                curveTo(15.48f, 9.75f, 15.47f, 9.75f, 15.45f, 9.75f)
                lineTo(16.19f, 11.09f)
                curveTo(16.73f, 12.07f, 16.71f, 13.24f, 16.14f, 14.21f)
                curveTo(15.57f, 15.18f, 14.56f, 15.76f, 13.43f, 15.76f)
                horizontalLineTo(9.76f)
                verticalLineTo(15.75f)
                close()
            }
        }.build()

        return _Shapes!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes: ImageVector? = null
