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

val Iconsax.Outline.FingerCricle: ImageVector
    get() {
        if (_FingerCricle != null) {
            return _FingerCricle!!
        }
        _FingerCricle = ImageVector.Builder(
            name = "Outline.FingerCricle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.63f)
                curveTo(10.68f, 15.63f, 9.6f, 14.55f, 9.6f, 13.23f)
                verticalLineTo(10.76f)
                curveTo(9.6f, 9.44f, 10.68f, 8.36f, 12f, 8.36f)
                curveTo(13.32f, 8.36f, 14.4f, 9.44f, 14.4f, 10.76f)
                verticalLineTo(13.23f)
                curveTo(14.4f, 14.56f, 13.32f, 15.63f, 12f, 15.63f)
                close()
                moveTo(12f, 9.87f)
                curveTo(11.51f, 9.87f, 11.1f, 10.27f, 11.1f, 10.77f)
                verticalLineTo(13.24f)
                curveTo(11.1f, 13.74f, 11.5f, 14.14f, 12f, 14.14f)
                curveTo(12.5f, 14.14f, 12.9f, 13.74f, 12.9f, 13.24f)
                verticalLineTo(10.77f)
                curveTo(12.9f, 10.27f, 12.49f, 9.87f, 12f, 9.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.82f)
                curveTo(8.83f, 18.82f, 6.25f, 16.24f, 6.25f, 13.07f)
                verticalLineTo(10.93f)
                curveTo(6.25f, 7.76f, 8.83f, 5.18f, 12f, 5.18f)
                curveTo(14.96f, 5.18f, 17.42f, 7.4f, 17.72f, 10.34f)
                curveTo(17.76f, 10.75f, 17.46f, 11.12f, 17.05f, 11.16f)
                curveTo(16.64f, 11.21f, 16.27f, 10.9f, 16.23f, 10.49f)
                curveTo(16.01f, 8.32f, 14.19f, 6.68f, 12f, 6.68f)
                curveTo(9.66f, 6.68f, 7.75f, 8.59f, 7.75f, 10.93f)
                verticalLineTo(13.07f)
                curveTo(7.75f, 15.41f, 9.66f, 17.32f, 12f, 17.32f)
                curveTo(14.2f, 17.32f, 16.06f, 15.6f, 16.24f, 13.41f)
                curveTo(16.27f, 13f, 16.63f, 12.69f, 17.05f, 12.72f)
                curveTo(17.46f, 12.75f, 17.77f, 13.11f, 17.74f, 13.53f)
                curveTo(17.5f, 16.5f, 14.98f, 18.82f, 12f, 18.82f)
                close()
            }
        }.build()

        return _FingerCricle!!
    }

@Suppress("ObjectPropertyName")
private var _FingerCricle: ImageVector? = null
