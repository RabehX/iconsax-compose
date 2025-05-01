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

val Iconsax.Outline.RotateLeft: ImageVector
    get() {
        if (_RotateLeft != null) {
            return _RotateLeft!!
        }
        _RotateLeft = ImageVector.Builder(
            name = "Outline.RotateLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.8f, 22.75f, 2.58f, 18.52f, 2.58f, 13.33f)
                curveTo(2.58f, 11.46f, 3.13f, 9.65f, 4.17f, 8.09f)
                curveTo(4.4f, 7.75f, 4.87f, 7.65f, 5.21f, 7.88f)
                curveTo(5.55f, 8.11f, 5.65f, 8.58f, 5.42f, 8.92f)
                curveTo(4.55f, 10.22f, 4.09f, 11.75f, 4.09f, 13.32f)
                curveTo(4.09f, 17.69f, 7.64f, 21.24f, 12.01f, 21.24f)
                curveTo(16.38f, 21.24f, 19.93f, 17.69f, 19.93f, 13.32f)
                curveTo(19.93f, 8.95f, 16.37f, 5.4f, 12f, 5.4f)
                curveTo(11.08f, 5.4f, 10.18f, 5.53f, 9.33f, 5.79f)
                curveTo(8.93f, 5.91f, 8.51f, 5.69f, 8.39f, 5.29f)
                curveTo(8.27f, 4.89f, 8.49f, 4.47f, 8.89f, 4.35f)
                curveTo(9.89f, 4.05f, 10.93f, 3.89f, 12f, 3.89f)
                curveTo(17.2f, 3.89f, 21.42f, 8.12f, 21.42f, 13.31f)
                curveTo(21.42f, 18.5f, 17.2f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.87f, 6.07f)
                curveTo(7.7f, 6.07f, 7.52f, 6.01f, 7.38f, 5.89f)
                curveTo(7.06f, 5.61f, 7.03f, 5.14f, 7.3f, 4.83f)
                lineTo(10.19f, 1.51f)
                curveTo(10.46f, 1.2f, 10.94f, 1.16f, 11.25f, 1.44f)
                curveTo(11.56f, 1.71f, 11.59f, 2.19f, 11.32f, 2.5f)
                lineTo(8.43f, 5.81f)
                curveTo(8.28f, 5.98f, 8.07f, 6.07f, 7.87f, 6.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.24f, 8.53f)
                curveTo(11.09f, 8.53f, 10.93f, 8.48f, 10.8f, 8.39f)
                lineTo(7.42f, 5.92f)
                curveTo(7.09f, 5.68f, 7.02f, 5.21f, 7.26f, 4.88f)
                curveTo(7.5f, 4.54f, 7.97f, 4.47f, 8.31f, 4.71f)
                lineTo(11.68f, 7.17f)
                curveTo(12.01f, 7.41f, 12.09f, 7.88f, 11.84f, 8.22f)
                curveTo(11.7f, 8.43f, 11.47f, 8.53f, 11.24f, 8.53f)
                close()
            }
        }.build()

        return _RotateLeft!!
    }

@Suppress("ObjectPropertyName")
private var _RotateLeft: ImageVector? = null
