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

val Iconsax.Outline.FingerScan: ImageVector
    get() {
        if (_FingerScan != null) {
            return _FingerScan!!
        }
        _FingerScan = ImageVector.Builder(
            name = "Outline.FingerScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9f)
                verticalLineTo(7f)
                curveTo(21.25f, 4.42f, 19.58f, 2.75f, 17f, 2.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 2.75f, 14.25f, 2.41f, 14.25f, 2f)
                curveTo(14.25f, 1.59f, 14.59f, 1.25f, 15f, 1.25f)
                horizontalLineTo(17f)
                curveTo(20.44f, 1.25f, 22.75f, 3.56f, 22.75f, 7f)
                verticalLineTo(9f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                verticalLineTo(7f)
                curveTo(1.25f, 3.56f, 3.56f, 1.25f, 7f, 1.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 1.25f, 9.75f, 1.59f, 9.75f, 2f)
                curveTo(9.75f, 2.41f, 9.41f, 2.75f, 9f, 2.75f)
                horizontalLineTo(7f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 7f)
                verticalLineTo(9f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 22.75f, 14.25f, 22.41f, 14.25f, 22f)
                curveTo(14.25f, 21.59f, 14.59f, 21.25f, 15f, 21.25f)
                horizontalLineTo(17f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 17f)
                verticalLineTo(15f)
                curveTo(21.25f, 14.59f, 21.59f, 14.25f, 22f, 14.25f)
                curveTo(22.41f, 14.25f, 22.75f, 14.59f, 22.75f, 15f)
                verticalLineTo(17f)
                curveTo(22.75f, 20.44f, 20.44f, 22.75f, 17f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22.75f)
                horizontalLineTo(7f)
                curveTo(3.56f, 22.75f, 1.25f, 20.44f, 1.25f, 17f)
                verticalLineTo(15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                curveTo(2.41f, 14.25f, 2.75f, 14.59f, 2.75f, 15f)
                verticalLineTo(17f)
                curveTo(2.75f, 19.58f, 4.42f, 21.25f, 7f, 21.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 21.25f, 9.75f, 21.59f, 9.75f, 22f)
                curveTo(9.75f, 22.41f, 9.41f, 22.75f, 9f, 22.75f)
                close()
            }
        }.build()

        return _FingerScan!!
    }

@Suppress("ObjectPropertyName")
private var _FingerScan: ImageVector? = null
