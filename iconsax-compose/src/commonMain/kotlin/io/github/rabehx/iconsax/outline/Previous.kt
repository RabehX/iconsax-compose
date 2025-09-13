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

val Iconsax.Outline.Previous: ImageVector
    get() {
        if (_Previous != null) {
            return _Previous!!
        }
        _Previous = ImageVector.Builder(
            name = "Outline.Previous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.69f, 20.09f)
                curveTo(17.12f, 20.09f, 16.56f, 19.94f, 16.04f, 19.64f)
                lineTo(7.75f, 14.86f)
                curveTo(6.72f, 14.26f, 6.1f, 13.19f, 6.1f, 12f)
                curveTo(6.1f, 10.81f, 6.72f, 9.74f, 7.75f, 9.14f)
                lineTo(16.04f, 4.36f)
                curveTo(17.07f, 3.76f, 18.3f, 3.76f, 19.34f, 4.36f)
                curveTo(20.38f, 4.96f, 20.99f, 6.02f, 20.99f, 7.22f)
                verticalLineTo(16.79f)
                curveTo(20.99f, 17.98f, 20.37f, 19.05f, 19.34f, 19.65f)
                curveTo(18.82f, 19.94f, 18.26f, 20.09f, 17.69f, 20.09f)
                close()
                moveTo(17.69f, 5.41f)
                curveTo(17.38f, 5.41f, 17.07f, 5.49f, 16.79f, 5.65f)
                lineTo(8.5f, 10.43f)
                curveTo(7.94f, 10.76f, 7.6f, 11.34f, 7.6f, 11.99f)
                curveTo(7.6f, 12.64f, 7.94f, 13.22f, 8.5f, 13.55f)
                lineTo(16.79f, 18.33f)
                curveTo(17.35f, 18.66f, 18.03f, 18.66f, 18.59f, 18.33f)
                curveTo(19.15f, 18f, 19.49f, 17.42f, 19.49f, 16.77f)
                verticalLineTo(7.2f)
                curveTo(19.49f, 6.55f, 19.15f, 5.97f, 18.59f, 5.64f)
                curveTo(18.31f, 5.5f, 18f, 5.41f, 17.69f, 5.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.76f, 18.93f)
                curveTo(3.35f, 18.93f, 3.01f, 18.59f, 3.01f, 18.18f)
                verticalLineTo(5.82f)
                curveTo(3.01f, 5.41f, 3.35f, 5.07f, 3.76f, 5.07f)
                curveTo(4.17f, 5.07f, 4.51f, 5.41f, 4.51f, 5.82f)
                verticalLineTo(18.18f)
                curveTo(4.51f, 18.59f, 4.17f, 18.93f, 3.76f, 18.93f)
                close()
            }
        }.build()

        return _Previous!!
    }

@Suppress("ObjectPropertyName")
private var _Previous: ImageVector? = null
