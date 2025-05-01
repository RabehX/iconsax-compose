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

val Iconsax.Outline.Layer: ImageVector
    get() {
        if (_Layer != null) {
            return _Layer!!
        }
        _Layer = ImageVector.Builder(
            name = "Outline.Layer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.79f, 11.88f)
                curveTo(11.25f, 11.88f, 10.7f, 11.78f, 10.27f, 11.59f)
                lineTo(4.37f, 8.97f)
                curveTo(2.87f, 8.3f, 2.65f, 7.4f, 2.65f, 6.91f)
                curveTo(2.65f, 6.42f, 2.87f, 5.52f, 4.37f, 4.85f)
                lineTo(10.27f, 2.23f)
                curveTo(11.14f, 1.84f, 12.45f, 1.84f, 13.32f, 2.23f)
                lineTo(19.23f, 4.85f)
                curveTo(20.72f, 5.51f, 20.95f, 6.42f, 20.95f, 6.91f)
                curveTo(20.95f, 7.4f, 20.73f, 8.3f, 19.23f, 8.97f)
                lineTo(13.32f, 11.59f)
                curveTo(12.88f, 11.79f, 12.34f, 11.88f, 11.79f, 11.88f)
                close()
                moveTo(11.79f, 3.44f)
                curveTo(11.45f, 3.44f, 11.12f, 3.49f, 10.88f, 3.6f)
                lineTo(4.98f, 6.22f)
                curveTo(4.37f, 6.5f, 4.15f, 6.78f, 4.15f, 6.91f)
                curveTo(4.15f, 7.04f, 4.37f, 7.33f, 4.97f, 7.6f)
                lineTo(10.87f, 10.22f)
                curveTo(11.35f, 10.43f, 12.22f, 10.43f, 12.7f, 10.22f)
                lineTo(18.61f, 7.6f)
                curveTo(19.22f, 7.33f, 19.44f, 7.04f, 19.44f, 6.91f)
                curveTo(19.44f, 6.78f, 19.22f, 6.49f, 18.61f, 6.22f)
                lineTo(12.71f, 3.6f)
                curveTo(12.47f, 3.5f, 12.13f, 3.44f, 11.79f, 3.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.09f)
                curveTo(11.62f, 17.09f, 11.24f, 17.01f, 10.88f, 16.85f)
                lineTo(4.09f, 13.83f)
                curveTo(3.06f, 13.38f, 2.25f, 12.13f, 2.25f, 11f)
                curveTo(2.25f, 10.59f, 2.59f, 10.25f, 3f, 10.25f)
                curveTo(3.41f, 10.25f, 3.75f, 10.59f, 3.75f, 11f)
                curveTo(3.75f, 11.55f, 4.2f, 12.24f, 4.7f, 12.47f)
                lineTo(11.49f, 15.49f)
                curveTo(11.81f, 15.63f, 12.18f, 15.63f, 12.51f, 15.49f)
                lineTo(19.3f, 12.47f)
                curveTo(19.8f, 12.25f, 20.25f, 11.55f, 20.25f, 11f)
                curveTo(20.25f, 10.59f, 20.59f, 10.25f, 21f, 10.25f)
                curveTo(21.41f, 10.25f, 21.75f, 10.59f, 21.75f, 11f)
                curveTo(21.75f, 12.13f, 20.94f, 13.38f, 19.91f, 13.84f)
                lineTo(13.12f, 16.86f)
                curveTo(12.76f, 17.01f, 12.38f, 17.09f, 12f, 17.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.09f)
                curveTo(11.62f, 22.09f, 11.24f, 22.01f, 10.88f, 21.85f)
                lineTo(4.09f, 18.83f)
                curveTo(2.97f, 18.33f, 2.25f, 17.22f, 2.25f, 15.99f)
                curveTo(2.25f, 15.58f, 2.59f, 15.24f, 3f, 15.24f)
                curveTo(3.41f, 15.24f, 3.75f, 15.59f, 3.75f, 16f)
                curveTo(3.75f, 16.63f, 4.12f, 17.21f, 4.7f, 17.47f)
                lineTo(11.49f, 20.49f)
                curveTo(11.81f, 20.63f, 12.18f, 20.63f, 12.51f, 20.49f)
                lineTo(19.3f, 17.47f)
                curveTo(19.88f, 17.21f, 20.25f, 16.64f, 20.25f, 16f)
                curveTo(20.25f, 15.59f, 20.59f, 15.25f, 21f, 15.25f)
                curveTo(21.41f, 15.25f, 21.75f, 15.59f, 21.75f, 16f)
                curveTo(21.75f, 17.23f, 21.03f, 18.34f, 19.91f, 18.84f)
                lineTo(13.12f, 21.86f)
                curveTo(12.76f, 22.01f, 12.38f, 22.09f, 12f, 22.09f)
                close()
            }
        }.build()

        return _Layer!!
    }

@Suppress("ObjectPropertyName")
private var _Layer: ImageVector? = null
