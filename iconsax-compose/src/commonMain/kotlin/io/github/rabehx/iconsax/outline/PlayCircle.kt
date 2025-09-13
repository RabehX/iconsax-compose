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

val Iconsax.Outline.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) {
            return _PlayCircle!!
        }
        _PlayCircle = ImageVector.Builder(
            name = "Outline.PlayCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.971f, 22.75f)
                curveTo(6.051f, 22.75f, 1.221f, 17.93f, 1.221f, 12f)
                curveTo(1.221f, 6.07f, 6.051f, 1.25f, 11.971f, 1.25f)
                curveTo(17.891f, 1.25f, 22.721f, 6.07f, 22.721f, 12f)
                curveTo(22.721f, 17.93f, 17.901f, 22.75f, 11.971f, 22.75f)
                close()
                moveTo(11.971f, 2.75f)
                curveTo(6.871f, 2.75f, 2.721f, 6.9f, 2.721f, 12f)
                curveTo(2.721f, 17.1f, 6.871f, 21.25f, 11.971f, 21.25f)
                curveTo(17.071f, 21.25f, 21.221f, 17.1f, 21.221f, 12f)
                curveTo(21.221f, 6.9f, 17.071f, 2.75f, 11.971f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.56f, 16.99f)
                curveTo(10.12f, 16.99f, 9.7f, 16.88f, 9.33f, 16.67f)
                curveTo(8.47f, 16.17f, 7.99f, 15.19f, 7.99f, 13.91f)
                verticalLineTo(10.56f)
                curveTo(7.99f, 9.28f, 8.46f, 8.3f, 9.32f, 7.8f)
                curveTo(10.18f, 7.3f, 11.27f, 7.38f, 12.38f, 8.02f)
                lineTo(15.28f, 9.69f)
                curveTo(16.39f, 10.33f, 17f, 11.23f, 17f, 12.23f)
                curveTo(17f, 13.22f, 16.39f, 14.13f, 15.28f, 14.77f)
                lineTo(12.38f, 16.44f)
                curveTo(11.76f, 16.81f, 11.13f, 16.99f, 10.56f, 16.99f)
                close()
                moveTo(10.56f, 8.97f)
                curveTo(10.38f, 8.97f, 10.21f, 9.01f, 10.08f, 9.09f)
                curveTo(9.7f, 9.31f, 9.49f, 9.84f, 9.49f, 10.56f)
                verticalLineTo(13.91f)
                curveTo(9.49f, 14.62f, 9.7f, 15.16f, 10.08f, 15.37f)
                curveTo(10.45f, 15.59f, 11.02f, 15.5f, 11.64f, 15.15f)
                lineTo(14.54f, 13.48f)
                curveTo(15.16f, 13.12f, 15.51f, 12.67f, 15.51f, 12.24f)
                curveTo(15.51f, 11.81f, 15.15f, 11.36f, 14.54f, 11f)
                lineTo(11.64f, 9.33f)
                curveTo(11.24f, 9.09f, 10.87f, 8.97f, 10.56f, 8.97f)
                close()
            }
        }.build()

        return _PlayCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCircle: ImageVector? = null
