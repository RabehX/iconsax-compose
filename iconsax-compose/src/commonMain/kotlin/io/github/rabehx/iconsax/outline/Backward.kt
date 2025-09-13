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

val Iconsax.Outline.Backward: ImageVector
    get() {
        if (_Backward != null) {
            return _Backward!!
        }
        _Backward = ImageVector.Builder(
            name = "Outline.Backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.05f, 18.36f)
                curveTo(19.59f, 18.36f, 19.12f, 18.24f, 18.7f, 17.99f)
                lineTo(12.36f, 14.33f)
                curveTo(12.07f, 14.16f, 11.84f, 13.96f, 11.67f, 13.74f)
                curveTo(11.56f, 13.61f, 11.5f, 13.44f, 11.5f, 13.27f)
                verticalLineTo(10.71f)
                curveTo(11.5f, 10.54f, 11.56f, 10.37f, 11.67f, 10.24f)
                curveTo(11.85f, 10.02f, 12.08f, 9.82f, 12.36f, 9.66f)
                lineTo(18.71f, 5.99f)
                curveTo(19.55f, 5.5f, 20.56f, 5.5f, 21.41f, 5.99f)
                curveTo(22.26f, 6.48f, 22.76f, 7.35f, 22.76f, 8.33f)
                verticalLineTo(15.65f)
                curveTo(22.76f, 16.63f, 22.26f, 17.5f, 21.41f, 17.99f)
                curveTo(20.98f, 18.24f, 20.51f, 18.36f, 20.05f, 18.36f)
                close()
                moveTo(12.99f, 12.96f)
                curveTo(13.03f, 12.99f, 13.07f, 13.02f, 13.11f, 13.04f)
                lineTo(19.44f, 16.69f)
                curveTo(19.82f, 16.91f, 20.27f, 16.91f, 20.64f, 16.69f)
                curveTo(21.02f, 16.47f, 21.24f, 16.08f, 21.24f, 15.65f)
                verticalLineTo(8.33f)
                curveTo(21.24f, 7.9f, 21.02f, 7.51f, 20.64f, 7.29f)
                curveTo(20.26f, 7.07f, 19.82f, 7.07f, 19.44f, 7.29f)
                lineTo(13.1f, 10.95f)
                curveTo(13.06f, 10.97f, 13.02f, 11f, 12.99f, 11.03f)
                verticalLineTo(12.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.29f, 18.36f)
                curveTo(9.83f, 18.36f, 9.36f, 18.24f, 8.94f, 17.99f)
                lineTo(2.6f, 14.33f)
                curveTo(1.76f, 13.84f, 1.25f, 12.97f, 1.25f, 11.99f)
                curveTo(1.25f, 11.01f, 1.75f, 10.14f, 2.6f, 9.65f)
                lineTo(8.94f, 5.99f)
                curveTo(9.78f, 5.5f, 10.79f, 5.5f, 11.64f, 5.99f)
                curveTo(12.49f, 6.48f, 12.99f, 7.35f, 12.99f, 8.33f)
                verticalLineTo(15.65f)
                curveTo(12.99f, 16.63f, 12.49f, 17.5f, 11.64f, 17.99f)
                curveTo(11.22f, 18.24f, 10.75f, 18.36f, 10.29f, 18.36f)
                close()
                moveTo(10.29f, 7.14f)
                curveTo(10.08f, 7.14f, 9.88f, 7.19f, 9.69f, 7.3f)
                lineTo(3.35f, 10.96f)
                curveTo(2.97f, 11.18f, 2.75f, 11.57f, 2.75f, 12f)
                curveTo(2.75f, 12.43f, 2.97f, 12.82f, 3.35f, 13.04f)
                lineTo(9.69f, 16.7f)
                curveTo(10.07f, 16.92f, 10.52f, 16.92f, 10.89f, 16.7f)
                curveTo(11.27f, 16.48f, 11.49f, 16.1f, 11.49f, 15.66f)
                verticalLineTo(8.34f)
                curveTo(11.49f, 7.91f, 11.27f, 7.52f, 10.89f, 7.3f)
                curveTo(10.7f, 7.19f, 10.5f, 7.14f, 10.29f, 7.14f)
                close()
            }
        }.build()

        return _Backward!!
    }

@Suppress("ObjectPropertyName")
private var _Backward: ImageVector? = null
