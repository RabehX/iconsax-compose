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

val Iconsax.Outline.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Outline.Camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.24f, 22.75f)
                horizontalLineTo(6.76f)
                curveTo(3.96f, 22.75f, 2.18f, 21.08f, 2.02f, 18.29f)
                lineTo(1.5f, 10.04f)
                curveTo(1.42f, 8.79f, 1.85f, 7.59f, 2.71f, 6.68f)
                curveTo(3.56f, 5.77f, 4.76f, 5.25f, 6f, 5.25f)
                curveTo(6.32f, 5.25f, 6.63f, 5.06f, 6.78f, 4.76f)
                lineTo(7.5f, 3.33f)
                curveTo(8.09f, 2.16f, 9.57f, 1.25f, 10.86f, 1.25f)
                horizontalLineTo(13.15f)
                curveTo(14.44f, 1.25f, 15.91f, 2.16f, 16.5f, 3.32f)
                lineTo(17.22f, 4.78f)
                curveTo(17.37f, 5.06f, 17.67f, 5.25f, 18f, 5.25f)
                curveTo(19.24f, 5.25f, 20.44f, 5.77f, 21.29f, 6.68f)
                curveTo(22.15f, 7.6f, 22.58f, 8.79f, 22.5f, 10.04f)
                lineTo(21.98f, 18.3f)
                curveTo(21.8f, 21.13f, 20.07f, 22.75f, 17.24f, 22.75f)
                close()
                moveTo(10.86f, 2.75f)
                curveTo(10.12f, 2.75f, 9.18f, 3.33f, 8.84f, 4f)
                lineTo(8.12f, 5.44f)
                curveTo(7.7f, 6.25f, 6.89f, 6.75f, 6f, 6.75f)
                curveTo(5.16f, 6.75f, 4.38f, 7.09f, 3.8f, 7.7f)
                curveTo(3.23f, 8.31f, 2.94f, 9.11f, 3f, 9.94f)
                lineTo(3.52f, 18.2f)
                curveTo(3.64f, 20.22f, 4.73f, 21.25f, 6.76f, 21.25f)
                horizontalLineTo(17.24f)
                curveTo(19.26f, 21.25f, 20.35f, 20.22f, 20.48f, 18.2f)
                lineTo(21f, 9.94f)
                curveTo(21.05f, 9.11f, 20.77f, 8.31f, 20.2f, 7.7f)
                curveTo(19.62f, 7.09f, 18.84f, 6.75f, 18f, 6.75f)
                curveTo(17.11f, 6.75f, 16.3f, 6.25f, 15.88f, 5.46f)
                lineTo(15.15f, 4f)
                curveTo(14.82f, 3.34f, 13.88f, 2.76f, 13.14f, 2.76f)
                horizontalLineTo(10.86f)
                verticalLineTo(2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 8.75f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 8.75f, 9.75f, 8.41f, 9.75f, 8f)
                curveTo(9.75f, 7.59f, 10.09f, 7.25f, 10.5f, 7.25f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 7.25f, 14.25f, 7.59f, 14.25f, 8f)
                curveTo(14.25f, 8.41f, 13.91f, 8.75f, 13.5f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(9.79f, 18.75f, 8f, 16.96f, 8f, 14.75f)
                curveTo(8f, 12.54f, 9.79f, 10.75f, 12f, 10.75f)
                curveTo(14.21f, 10.75f, 16f, 12.54f, 16f, 14.75f)
                curveTo(16f, 16.96f, 14.21f, 18.75f, 12f, 18.75f)
                close()
                moveTo(12f, 12.25f)
                curveTo(10.62f, 12.25f, 9.5f, 13.37f, 9.5f, 14.75f)
                curveTo(9.5f, 16.13f, 10.62f, 17.25f, 12f, 17.25f)
                curveTo(13.38f, 17.25f, 14.5f, 16.13f, 14.5f, 14.75f)
                curveTo(14.5f, 13.37f, 13.38f, 12.25f, 12f, 12.25f)
                close()
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null
