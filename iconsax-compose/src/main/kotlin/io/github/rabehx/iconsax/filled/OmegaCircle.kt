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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.OmegaCircle: ImageVector
    get() {
        if (_OmegaCircle != null) {
            return _OmegaCircle!!
        }
        _OmegaCircle = ImageVector.Builder(
            name = "Filled.OmegaCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(17f, 17.25f)
                horizontalLineTo(13.9f)
                curveTo(13.6f, 17.25f, 13.33f, 17.08f, 13.21f, 16.8f)
                curveTo(13.09f, 16.52f, 13.14f, 16.21f, 13.34f, 15.99f)
                lineTo(14.96f, 14.2f)
                curveTo(15.63f, 13.45f, 16.01f, 12.5f, 16.01f, 11.52f)
                curveTo(16.01f, 10.52f, 15.6f, 9.58f, 14.85f, 8.87f)
                curveTo(14.1f, 8.16f, 13.06f, 7.75f, 12f, 7.75f)
                curveTo(10.94f, 7.75f, 9.9f, 8.16f, 9.15f, 8.87f)
                curveTo(8.4f, 9.58f, 7.99f, 10.52f, 7.99f, 11.52f)
                curveTo(7.99f, 12.5f, 8.36f, 13.45f, 9.04f, 14.2f)
                lineTo(10.65f, 16f)
                curveTo(10.85f, 16.22f, 10.9f, 16.54f, 10.78f, 16.81f)
                curveTo(10.66f, 17.08f, 10.39f, 17.26f, 10.09f, 17.26f)
                horizontalLineTo(7f)
                curveTo(6.59f, 17.26f, 6.25f, 16.92f, 6.25f, 16.51f)
                curveTo(6.25f, 16.1f, 6.59f, 15.75f, 7f, 15.75f)
                horizontalLineTo(8.41f)
                lineTo(7.92f, 15.21f)
                curveTo(7f, 14.19f, 6.49f, 12.88f, 6.49f, 11.52f)
                curveTo(6.49f, 10.13f, 7.08f, 8.76f, 8.12f, 7.78f)
                curveTo(9.16f, 6.79f, 10.53f, 6.25f, 12f, 6.25f)
                curveTo(13.47f, 6.25f, 14.84f, 6.79f, 15.88f, 7.78f)
                curveTo(16.91f, 8.76f, 17.51f, 10.13f, 17.51f, 11.52f)
                curveTo(17.51f, 12.87f, 17f, 14.18f, 16.08f, 15.21f)
                lineTo(15.59f, 15.75f)
                horizontalLineTo(17f)
                curveTo(17.41f, 15.75f, 17.75f, 16.09f, 17.75f, 16.5f)
                curveTo(17.75f, 16.91f, 17.41f, 17.25f, 17f, 17.25f)
                close()
            }
        }.build()

        return _OmegaCircle!!
    }

@Suppress("ObjectPropertyName")
private var _OmegaCircle: ImageVector? = null
