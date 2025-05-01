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

val Iconsax.Outline.PercentageCircle: ImageVector
    get() {
        if (_PercentageCircle != null) {
            return _PercentageCircle!!
        }
        _PercentageCircle = ImageVector.Builder(
            name = "Outline.PercentageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.57f, 16.02f)
                curveTo(8.38f, 16.02f, 8.19f, 15.95f, 8.04f, 15.8f)
                curveTo(7.75f, 15.51f, 7.75f, 15.03f, 8.04f, 14.74f)
                lineTo(14.59f, 8.19f)
                curveTo(14.88f, 7.9f, 15.36f, 7.9f, 15.65f, 8.19f)
                curveTo(15.94f, 8.48f, 15.94f, 8.96f, 15.65f, 9.25f)
                lineTo(9.1f, 15.8f)
                curveTo(8.95f, 15.95f, 8.76f, 16.02f, 8.57f, 16.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.98f, 11.11f)
                curveTo(7.89f, 11.11f, 7f, 10.22f, 7f, 9.13f)
                curveTo(7f, 8.04f, 7.89f, 7.15f, 8.98f, 7.15f)
                curveTo(10.07f, 7.15f, 10.96f, 8.04f, 10.96f, 9.13f)
                curveTo(10.96f, 10.22f, 10.07f, 11.11f, 8.98f, 11.11f)
                close()
                moveTo(8.98f, 8.66f)
                curveTo(8.72f, 8.66f, 8.5f, 8.87f, 8.5f, 9.14f)
                curveTo(8.5f, 9.41f, 8.71f, 9.62f, 8.98f, 9.62f)
                curveTo(9.25f, 9.62f, 9.46f, 9.41f, 9.46f, 9.14f)
                curveTo(9.46f, 8.87f, 9.24f, 8.66f, 8.98f, 8.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.519f, 16.84f)
                curveTo(14.429f, 16.84f, 13.539f, 15.95f, 13.539f, 14.86f)
                curveTo(13.539f, 13.77f, 14.429f, 12.88f, 15.519f, 12.88f)
                curveTo(16.609f, 12.88f, 17.499f, 13.77f, 17.499f, 14.86f)
                curveTo(17.499f, 15.95f, 16.609f, 16.84f, 15.519f, 16.84f)
                close()
                moveTo(15.519f, 14.39f)
                curveTo(15.259f, 14.39f, 15.039f, 14.6f, 15.039f, 14.87f)
                curveTo(15.039f, 15.14f, 15.249f, 15.35f, 15.519f, 15.35f)
                curveTo(15.789f, 15.35f, 15.999f, 15.14f, 15.999f, 14.87f)
                curveTo(15.999f, 14.6f, 15.789f, 14.39f, 15.519f, 14.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _PercentageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PercentageCircle: ImageVector? = null
