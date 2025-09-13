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

val Iconsax.Outline.CpuSetting: ImageVector
    get() {
        if (_CpuSetting != null) {
            return _CpuSetting!!
        }
        _CpuSetting = ImageVector.Builder(
            name = "Outline.CpuSetting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.6f, 20.75f)
                curveTo(5.21f, 20.75f, 3.25f, 18.79f, 3.25f, 14.4f)
                verticalLineTo(9.6f)
                curveTo(3.25f, 5.21f, 5.21f, 3.25f, 9.6f, 3.25f)
                horizontalLineTo(14.4f)
                curveTo(18.79f, 3.25f, 20.75f, 5.21f, 20.75f, 9.6f)
                curveTo(20.75f, 10.01f, 20.41f, 10.35f, 20f, 10.35f)
                curveTo(19.59f, 10.35f, 19.25f, 10.01f, 19.25f, 9.6f)
                curveTo(19.25f, 6.02f, 17.98f, 4.75f, 14.4f, 4.75f)
                horizontalLineTo(9.6f)
                curveTo(6.02f, 4.75f, 4.75f, 6.02f, 4.75f, 9.6f)
                verticalLineTo(14.4f)
                curveTo(4.75f, 17.98f, 6.02f, 19.25f, 9.6f, 19.25f)
                curveTo(10.01f, 19.25f, 10.35f, 19.59f, 10.35f, 20f)
                curveTo(10.35f, 20.41f, 10.01f, 20.75f, 9.6f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.99f, 17.1f)
                curveTo(7.83f, 17.1f, 7.66f, 17.05f, 7.52f, 16.94f)
                curveTo(6.65f, 16.25f, 6.24f, 15.15f, 6.24f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(6.24f, 7.6f, 7.59f, 6.25f, 10.49f, 6.25f)
                horizontalLineTo(13.49f)
                curveTo(15.14f, 6.25f, 16.23f, 6.66f, 16.93f, 7.53f)
                curveTo(17.19f, 7.85f, 17.13f, 8.33f, 16.81f, 8.58f)
                curveTo(16.49f, 8.84f, 16.01f, 8.79f, 15.76f, 8.46f)
                curveTo(15.52f, 8.15f, 15.02f, 7.75f, 13.5f, 7.75f)
                horizontalLineTo(10.5f)
                curveTo(8.42f, 7.75f, 7.75f, 8.42f, 7.75f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(7.75f, 15.02f, 8.16f, 15.52f, 8.46f, 15.76f)
                curveTo(8.78f, 16.02f, 8.84f, 16.49f, 8.58f, 16.81f)
                curveTo(8.43f, 17f, 8.21f, 17.1f, 7.99f, 17.1f)
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
                moveTo(16.71f, 19.34f)
                curveTo(15.42f, 19.34f, 14.37f, 18.29f, 14.37f, 17f)
                curveTo(14.37f, 15.71f, 15.42f, 14.66f, 16.71f, 14.66f)
                curveTo(18f, 14.66f, 19.05f, 15.71f, 19.05f, 17f)
                curveTo(19.04f, 18.29f, 18f, 19.34f, 16.71f, 19.34f)
                close()
                moveTo(16.71f, 16.16f)
                curveTo(16.25f, 16.16f, 15.87f, 16.54f, 15.87f, 17f)
                curveTo(15.87f, 17.46f, 16.25f, 17.84f, 16.71f, 17.84f)
                curveTo(17.17f, 17.84f, 17.55f, 17.46f, 17.55f, 17f)
                curveTo(17.54f, 16.54f, 17.17f, 16.16f, 16.71f, 16.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.4f, 22.75f)
                curveTo(17.84f, 22.75f, 17.29f, 22.46f, 16.99f, 21.94f)
                lineTo(16.92f, 21.83f)
                curveTo(16.81f, 21.64f, 16.72f, 21.59f, 16.7f, 21.58f)
                curveTo(16.69f, 21.58f, 16.59f, 21.64f, 16.48f, 21.83f)
                lineTo(16.42f, 21.93f)
                curveTo(15.96f, 22.72f, 14.95f, 22.98f, 14.18f, 22.52f)
                lineTo(13.28f, 22f)
                curveTo(12.87f, 21.77f, 12.58f, 21.39f, 12.46f, 20.93f)
                curveTo(12.34f, 20.48f, 12.4f, 20f, 12.63f, 19.6f)
                curveTo(12.74f, 19.41f, 12.74f, 19.3f, 12.73f, 19.28f)
                curveTo(12.72f, 19.27f, 12.63f, 19.22f, 12.41f, 19.22f)
                curveTo(11.44f, 19.22f, 10.65f, 18.43f, 10.65f, 17.47f)
                verticalLineTo(16.54f)
                curveTo(10.65f, 15.57f, 11.44f, 14.79f, 12.4f, 14.79f)
                curveTo(12.62f, 14.79f, 12.71f, 14.73f, 12.73f, 14.72f)
                curveTo(12.73f, 14.71f, 12.73f, 14.6f, 12.62f, 14.41f)
                curveTo(12.39f, 14f, 12.32f, 13.53f, 12.45f, 13.08f)
                curveTo(12.57f, 12.63f, 12.86f, 12.25f, 13.27f, 12.01f)
                lineTo(14.18f, 11.48f)
                curveTo(14.94f, 11.03f, 15.95f, 11.29f, 16.4f, 12.07f)
                lineTo(16.46f, 12.18f)
                curveTo(16.57f, 12.37f, 16.66f, 12.42f, 16.68f, 12.43f)
                curveTo(16.69f, 12.43f, 16.79f, 12.37f, 16.9f, 12.18f)
                lineTo(16.96f, 12.08f)
                curveTo(17.43f, 11.29f, 18.43f, 11.03f, 19.2f, 11.49f)
                lineTo(20.13f, 12f)
                curveTo(20.54f, 12.23f, 20.83f, 12.61f, 20.95f, 13.07f)
                curveTo(21.07f, 13.52f, 21.01f, 14f, 20.78f, 14.4f)
                curveTo(20.67f, 14.59f, 20.67f, 14.7f, 20.68f, 14.72f)
                curveTo(20.69f, 14.73f, 20.78f, 14.78f, 21f, 14.78f)
                curveTo(21.97f, 14.78f, 22.76f, 15.57f, 22.76f, 16.53f)
                verticalLineTo(17.46f)
                curveTo(22.76f, 18.43f, 21.97f, 19.21f, 21.01f, 19.21f)
                curveTo(20.79f, 19.21f, 20.7f, 19.27f, 20.68f, 19.28f)
                curveTo(20.68f, 19.29f, 20.68f, 19.4f, 20.79f, 19.59f)
                curveTo(21.02f, 20f, 21.09f, 20.47f, 20.96f, 20.92f)
                curveTo(20.84f, 21.37f, 20.55f, 21.75f, 20.14f, 21.99f)
                lineTo(19.23f, 22.52f)
                curveTo(18.96f, 22.67f, 18.68f, 22.75f, 18.4f, 22.75f)
                close()
                moveTo(16.71f, 20.08f)
                curveTo(17.31f, 20.08f, 17.86f, 20.44f, 18.23f, 21.08f)
                lineTo(18.29f, 21.19f)
                curveTo(18.32f, 21.24f, 18.4f, 21.27f, 18.46f, 21.23f)
                lineTo(19.38f, 20.7f)
                curveTo(19.46f, 20.66f, 19.49f, 20.58f, 19.5f, 20.54f)
                curveTo(19.51f, 20.5f, 19.52f, 20.43f, 19.48f, 20.35f)
                curveTo(19.11f, 19.72f, 19.08f, 19.06f, 19.38f, 18.54f)
                curveTo(19.68f, 18.02f, 20.27f, 17.72f, 21f, 17.72f)
                curveTo(21.14f, 17.72f, 21.26f, 17.6f, 21.26f, 17.47f)
                verticalLineTo(16.54f)
                curveTo(21.26f, 16.4f, 21.14f, 16.29f, 21.01f, 16.29f)
                curveTo(20.28f, 16.29f, 19.68f, 15.99f, 19.39f, 15.47f)
                curveTo(19.09f, 14.95f, 19.13f, 14.29f, 19.49f, 13.66f)
                curveTo(19.54f, 13.58f, 19.53f, 13.5f, 19.51f, 13.47f)
                curveTo(19.5f, 13.43f, 19.47f, 13.36f, 19.39f, 13.31f)
                lineTo(18.48f, 12.78f)
                curveTo(18.41f, 12.74f, 18.33f, 12.77f, 18.29f, 12.83f)
                lineTo(18.24f, 12.92f)
                curveTo(17.87f, 13.56f, 17.32f, 13.92f, 16.72f, 13.92f)
                curveTo(16.12f, 13.92f, 15.57f, 13.56f, 15.2f, 12.92f)
                lineTo(15.14f, 12.82f)
                curveTo(15.11f, 12.76f, 15.02f, 12.74f, 14.97f, 12.77f)
                lineTo(14.05f, 13.3f)
                curveTo(13.97f, 13.34f, 13.94f, 13.42f, 13.93f, 13.46f)
                curveTo(13.92f, 13.5f, 13.91f, 13.57f, 13.95f, 13.65f)
                curveTo(14.32f, 14.28f, 14.35f, 14.94f, 14.05f, 15.46f)
                curveTo(13.75f, 15.98f, 13.16f, 16.28f, 12.43f, 16.28f)
                curveTo(12.29f, 16.28f, 12.17f, 16.4f, 12.17f, 16.53f)
                verticalLineTo(17.46f)
                curveTo(12.17f, 17.6f, 12.29f, 17.71f, 12.42f, 17.71f)
                curveTo(13.15f, 17.71f, 13.75f, 18.01f, 14.04f, 18.53f)
                curveTo(14.34f, 19.05f, 14.3f, 19.71f, 13.94f, 20.34f)
                curveTo(13.9f, 20.42f, 13.91f, 20.49f, 13.92f, 20.53f)
                curveTo(13.93f, 20.57f, 13.96f, 20.64f, 14.04f, 20.69f)
                lineTo(14.95f, 21.22f)
                curveTo(15.02f, 21.26f, 15.1f, 21.23f, 15.14f, 21.17f)
                lineTo(15.19f, 21.07f)
                curveTo(15.55f, 20.44f, 16.11f, 20.08f, 16.71f, 20.08f)
                close()
            }
        }.build()

        return _CpuSetting!!
    }

@Suppress("ObjectPropertyName")
private var _CpuSetting: ImageVector? = null
