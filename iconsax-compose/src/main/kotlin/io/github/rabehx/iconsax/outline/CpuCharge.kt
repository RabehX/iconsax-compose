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

val Iconsax.Outline.CpuCharge: ImageVector
    get() {
        if (_CpuCharge != null) {
            return _CpuCharge!!
        }
        _CpuCharge = ImageVector.Builder(
            name = "Outline.CpuCharge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.4f, 20.75f)
                horizontalLineTo(9.6f)
                curveTo(5.21f, 20.75f, 3.25f, 18.79f, 3.25f, 14.4f)
                verticalLineTo(9.6f)
                curveTo(3.25f, 5.21f, 5.21f, 3.25f, 9.6f, 3.25f)
                horizontalLineTo(14.4f)
                curveTo(18.79f, 3.25f, 20.75f, 5.21f, 20.75f, 9.6f)
                verticalLineTo(14.4f)
                curveTo(20.75f, 18.79f, 18.79f, 20.75f, 14.4f, 20.75f)
                close()
                moveTo(9.6f, 4.75f)
                curveTo(6.02f, 4.75f, 4.75f, 6.02f, 4.75f, 9.6f)
                verticalLineTo(14.4f)
                curveTo(4.75f, 17.98f, 6.02f, 19.25f, 9.6f, 19.25f)
                horizontalLineTo(14.4f)
                curveTo(17.98f, 19.25f, 19.25f, 17.98f, 19.25f, 14.4f)
                verticalLineTo(9.6f)
                curveTo(19.25f, 6.02f, 17.98f, 4.75f, 14.4f, 4.75f)
                horizontalLineTo(9.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 17.75f)
                horizontalLineTo(10.5f)
                curveTo(7.6f, 17.75f, 6.25f, 16.4f, 6.25f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(6.25f, 7.6f, 7.6f, 6.25f, 10.5f, 6.25f)
                horizontalLineTo(13.5f)
                curveTo(16.4f, 6.25f, 17.75f, 7.6f, 17.75f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(17.75f, 16.4f, 16.4f, 17.75f, 13.5f, 17.75f)
                close()
                moveTo(10.5f, 7.75f)
                curveTo(8.42f, 7.75f, 7.75f, 8.42f, 7.75f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(7.75f, 15.58f, 8.42f, 16.25f, 10.5f, 16.25f)
                horizontalLineTo(13.5f)
                curveTo(15.58f, 16.25f, 16.25f, 15.58f, 16.25f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(16.25f, 8.42f, 15.58f, 7.75f, 13.5f, 7.75f)
                horizontalLineTo(10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.01f, 4.75f)
                curveTo(7.59f, 4.75f, 7.26f, 4.41f, 7.26f, 4f)
                verticalLineTo(2f)
                curveTo(7.26f, 1.59f, 7.6f, 1.25f, 8.01f, 1.25f)
                curveTo(8.42f, 1.25f, 8.76f, 1.59f, 8.76f, 2f)
                verticalLineTo(4f)
                curveTo(8.76f, 4.41f, 8.42f, 4.75f, 8.01f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4.75f)
                curveTo(11.59f, 4.75f, 11.25f, 4.41f, 11.25f, 4f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(4f)
                curveTo(12.75f, 4.41f, 12.41f, 4.75f, 12f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 4.75f)
                curveTo(15.59f, 4.75f, 15.25f, 4.41f, 15.25f, 4f)
                verticalLineTo(2f)
                curveTo(15.25f, 1.59f, 15.59f, 1.25f, 16f, 1.25f)
                curveTo(16.41f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                verticalLineTo(4f)
                curveTo(16.75f, 4.41f, 16.41f, 4.75f, 16f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.75f)
                horizontalLineTo(20f)
                curveTo(19.59f, 8.75f, 19.25f, 8.41f, 19.25f, 8f)
                curveTo(19.25f, 7.59f, 19.59f, 7.25f, 20f, 7.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 7.25f, 22.75f, 7.59f, 22.75f, 8f)
                curveTo(22.75f, 8.41f, 22.42f, 8.75f, 22f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.75f)
                horizontalLineTo(20f)
                curveTo(19.59f, 12.75f, 19.25f, 12.41f, 19.25f, 12f)
                curveTo(19.25f, 11.59f, 19.59f, 11.25f, 20f, 11.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.42f, 12.75f, 22f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 16.75f)
                horizontalLineTo(20f)
                curveTo(19.59f, 16.75f, 19.25f, 16.41f, 19.25f, 16f)
                curveTo(19.25f, 15.59f, 19.59f, 15.25f, 20f, 15.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 15.25f, 22.75f, 15.59f, 22.75f, 16f)
                curveTo(22.75f, 16.41f, 22.42f, 16.75f, 22f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                curveTo(15.59f, 22.75f, 15.25f, 22.41f, 15.25f, 22f)
                verticalLineTo(20f)
                curveTo(15.25f, 19.59f, 15.59f, 19.25f, 16f, 19.25f)
                curveTo(16.41f, 19.25f, 16.75f, 19.59f, 16.75f, 20f)
                verticalLineTo(22f)
                curveTo(16.75f, 22.41f, 16.41f, 22.75f, 16f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.01f, 22.75f)
                curveTo(11.6f, 22.75f, 11.26f, 22.41f, 11.26f, 22f)
                verticalLineTo(20f)
                curveTo(11.26f, 19.59f, 11.6f, 19.25f, 12.01f, 19.25f)
                curveTo(12.42f, 19.25f, 12.76f, 19.59f, 12.76f, 20f)
                verticalLineTo(22f)
                curveTo(12.76f, 22.41f, 12.42f, 22.75f, 12.01f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.01f, 22.75f)
                curveTo(7.6f, 22.75f, 7.26f, 22.41f, 7.26f, 22f)
                verticalLineTo(20f)
                curveTo(7.26f, 19.59f, 7.6f, 19.25f, 8.01f, 19.25f)
                curveTo(8.42f, 19.25f, 8.76f, 19.59f, 8.76f, 20f)
                verticalLineTo(22f)
                curveTo(8.76f, 22.41f, 8.42f, 22.75f, 8.01f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 8.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 8.75f, 1.25f, 8.42f, 1.25f, 8f)
                curveTo(1.25f, 7.58f, 1.59f, 7.25f, 2f, 7.25f)
                horizontalLineTo(4f)
                curveTo(4.41f, 7.25f, 4.75f, 7.59f, 4.75f, 8f)
                curveTo(4.75f, 8.41f, 4.42f, 8.75f, 4f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(4f)
                curveTo(4.41f, 11.25f, 4.75f, 11.59f, 4.75f, 12f)
                curveTo(4.75f, 12.41f, 4.42f, 12.75f, 4f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 16.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 16.75f, 1.25f, 16.41f, 1.25f, 16f)
                curveTo(1.25f, 15.59f, 1.59f, 15.25f, 2f, 15.25f)
                horizontalLineTo(4f)
                curveTo(4.41f, 15.25f, 4.75f, 15.59f, 4.75f, 16f)
                curveTo(4.75f, 16.41f, 4.42f, 16.75f, 4f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.05f)
                curveTo(11.87f, 15.05f, 11.74f, 15.02f, 11.63f, 14.95f)
                curveTo(11.27f, 14.74f, 11.15f, 14.28f, 11.35f, 13.93f)
                lineTo(12.03f, 12.75f)
                horizontalLineTo(11.44f)
                curveTo(10.96f, 12.75f, 10.57f, 12.54f, 10.36f, 12.18f)
                curveTo(10.15f, 11.82f, 10.17f, 11.37f, 10.4f, 10.96f)
                lineTo(11.34f, 9.32f)
                curveTo(11.55f, 8.96f, 12.01f, 8.84f, 12.36f, 9.04f)
                curveTo(12.72f, 9.25f, 12.84f, 9.71f, 12.64f, 10.06f)
                lineTo(11.96f, 11.24f)
                horizontalLineTo(12.55f)
                curveTo(13.03f, 11.24f, 13.42f, 11.45f, 13.63f, 11.81f)
                curveTo(13.84f, 12.17f, 13.82f, 12.62f, 13.59f, 13.03f)
                lineTo(12.65f, 14.67f)
                curveTo(12.51f, 14.92f, 12.26f, 15.05f, 12f, 15.05f)
                close()
            }
        }.build()

        return _CpuCharge!!
    }

@Suppress("ObjectPropertyName")
private var _CpuCharge: ImageVector? = null
